package com.rentme.repository;

import org.springframework.data.repository.CrudRepository;

import com.rentme.entities.UserLoginEntity;

public interface UserLoginRepository extends CrudRepository<UserLoginEntity, Long> {

}
