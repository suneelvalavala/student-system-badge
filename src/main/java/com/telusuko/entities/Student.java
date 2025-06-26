package com.telusuko.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int completedCourses;
    private double averageScore;
    private boolean uploadedProject;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCompletedCourses() {
		return completedCourses;
	}
	public void setCompletedCourses(int completedCourses) {
		this.completedCourses = completedCourses;
	}
	public double getAverageScore() {
		return averageScore;
	}
	public void setAverageScore(double averageScore) {
		this.averageScore = averageScore;
	}
	public boolean isUploadedProject() {
		return uploadedProject;
	}
	public void setUploadedProject(boolean uploadedProject) {
		this.uploadedProject = uploadedProject;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", completedCourses=" + completedCourses + ", averageScore="
				+ averageScore + ", uploadedProject=" + uploadedProject + "]";
	}

	
    
    
}
