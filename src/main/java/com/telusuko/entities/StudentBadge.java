package com.telusuko.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
public class StudentBadge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    private Long studentId;

    
    private Long badgeId;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getStudentId() {
		return studentId;
	}


	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}


	public Long getBadgeId() {
		return badgeId;
	}


	public void setBadgeId(Long badgeId) {
		this.badgeId = badgeId;
	}


	@Override
	public String toString() {
		return "StudentBadge [id=" + id + ", studentId=" + studentId + ", badgeId=" + badgeId + "]";
	}


	
	
	


	

	
    
    
}
