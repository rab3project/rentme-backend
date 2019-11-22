package com.rentme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rentme.entities.UserEntity;

@Repository
public interface UserSignupRepository extends JpaRepository<UserEntity, Long> {
}
