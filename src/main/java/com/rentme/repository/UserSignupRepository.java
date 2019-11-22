package com.rentme.repository;

import com.rentme.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSignupRepository extends JpaRepository<User, Long> {
}
