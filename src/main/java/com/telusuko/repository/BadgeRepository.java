package com.telusuko.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusuko.entities.Badge;

@Repository
public interface BadgeRepository extends JpaRepository<Badge, Long> {
    Badge findByName(String name);
}