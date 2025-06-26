package com.telusuko.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusuko.dto.BadgeDTO;
import com.telusuko.entities.Badge;
import com.telusuko.entities.Student;
import com.telusuko.entities.StudentBadge;
import com.telusuko.repository.BadgeRepository;
import com.telusuko.repository.StudentBadgeRepository;
import com.telusuko.repository.StudentRepository;

@Service
public class BadgeService {
	@Autowired
	private StudentRepository studentRepo;

	@Autowired
	private BadgeRepository badgeRepo;

	@Autowired
	private StudentBadgeRepository studentBadgeRepo;

	@Autowired
	StudentService studentService;

	public List<BadgeDTO> getBadgesByStudentId(Long studentId) {
		List<StudentBadge> studentBadges = studentBadgeRepo.findByStudentId(studentId);
	    List<BadgeDTO> badges = new ArrayList<>();

	    for (StudentBadge sb : studentBadges) {
	        Badge badge = badgeRepo.getById(sb.getBadgeId());
	        badges.add(new BadgeDTO(badge)); // convert entity to DTO
	    }

	    return badges;
	}

	public void evaluateAndAwardBadges(Long studentId) {

		
		Student student = studentService.getStudent(studentId);

		awardIfEligible(student, "Course Completion", student.getCompletedCourses() >= 3);
		awardIfEligible(student, "High Performer", student.getAverageScore() >= 80);
		awardIfEligible(student, "Capstone Contributor", student.isUploadedProject());

	}

	private void awardIfEligible(Student student, String badgeName, boolean condition) {
		if (!condition) {
			return;
		}

		int countOfBadgesAwarded=0;
		Badge badge = badgeRepo.findByName(badgeName);

		boolean alreadyAwarded = false;
		List<StudentBadge> studentBadges = studentBadgeRepo.findByStudentId(student.getId());

		for (StudentBadge sb : studentBadges) {
			Long badgeId = sb.getBadgeId();
			Badge badgeById = badgeRepo.getById(badgeId);
			if (badgeById.getName().equals(badgeName)) {

				alreadyAwarded = true;
				break;
			}
		}

		if (!alreadyAwarded) {
			countOfBadgesAwarded++;
			StudentBadge studentBadge = new StudentBadge();
			studentBadge.setBadgeId(badge.getId());
			studentBadge.setStudentId(student.getId());
			studentBadgeRepo.save(studentBadge);
		}
	}
}