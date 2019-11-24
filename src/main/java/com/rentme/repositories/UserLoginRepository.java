package com.rentme.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.rentme.entities.UserLoginEntity;

@Transactional
@Repository
public interface UserLoginRepository extends CrudRepository<UserLoginEntity, Long> {

	public UserLoginEntity findByUsernameAndPassword(String username, String password);

}
