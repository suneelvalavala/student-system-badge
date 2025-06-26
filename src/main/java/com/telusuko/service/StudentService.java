package com.telusuko.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusuko.entities.Student;
import com.telusuko.repository.StudentRepository;


@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepo;
	
	public Student getStudent(Long studentId) {
		return studentRepo.getById(studentId);
	}
	
	
}
