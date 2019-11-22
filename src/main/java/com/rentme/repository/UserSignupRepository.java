package com.rentme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rentme.entities.UserSignupEntity;

@Repository
public interface UserSignupRepository extends JpaRepository<UserSignupEntity, Long> {
}
