package com.rentme.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.rentme.entities.UserLoginEntity;

@Transactional
public interface UserLoginRepository extends CrudRepository<UserLoginEntity, Long> {

	public Boolean findByUsernameAndPassword(String username, String password) ;

}
