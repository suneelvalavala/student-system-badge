package com.telusuko.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusuko.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository <Student, Long> {
	
}

