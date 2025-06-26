package com.telusuko.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import com.telusuko.entities.Badge;

public class ResponseDTO {

    private String studentName;
    
    private List<BadgeDTO> badges;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<BadgeDTO> getBadges() {
        return badges;
    }

    public void setBadges(List<BadgeDTO> badges) {
        this.badges = badges;
    }
}
