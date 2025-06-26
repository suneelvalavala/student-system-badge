package com.telusuko.dto;

import com.telusuko.entities.Badge;

public class BadgeDTO {
    private Long id;
    private String name;

    public BadgeDTO() {
    }

    public BadgeDTO(Badge badge) {
        this.id = badge.getId();
        this.name = badge.getName();
    }

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
}

