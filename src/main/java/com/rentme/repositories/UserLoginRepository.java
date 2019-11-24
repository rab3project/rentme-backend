package com.rentme.repositories;

import java.util.Optional;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.rentme.entities.UserLoginEntity;

@Transactional
@Repository
public interface UserLoginRepository extends JpaRepository<UserLoginEntity, Long> {

	
	
	public UserLoginEntity findByUsernameAndPassword(String username, String password);
	

}
