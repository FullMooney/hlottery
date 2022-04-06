package com.hanwha.hlottery.repository;

import com.hanwha.hlottery.entity.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
    
}