package com.telusuko.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusuko.dto.ResponseDTO;
import com.telusuko.entities.Badge;
import com.telusuko.entities.Student;
import com.telusuko.entities.Test;
import com.telusuko.service.BadgeService;
import com.telusuko.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentBadgeController {

	@Autowired
	BadgeService badgeService;

	@Autowired
	StudentService studentService;

	@GetMapping("/student/{id}/badges")
	public ResponseEntity<ResponseDTO> getBadges(@PathVariable Long id) {

		Student student = studentService.getStudent(id);
		ResponseDTO response = new ResponseDTO();

		response.setStudentName(student.getName());
		response.setBadges(badgeService.getBadgesByStudentId(id));

    	
		return ResponseEntity.ok(response);

	}

	@PostMapping("/badges/evaluate/{studentId}")
	public ResponseEntity<String> evaluateBadges(@PathVariable Long studentId) {
		badgeService.evaluateAndAwardBadges(studentId);
		return ResponseEntity.ok("Badge is evaluated and awarded if applicable");
	}
}
