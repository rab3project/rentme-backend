package com.rentme.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rentme.dtos.UserLoginDto;
import com.rentme.entities.UserLoginEntity;
import com.rentme.repositories.UserLoginRepository;

@Service
public class UserLoginService {

	@Autowired
	private UserLoginRepository uLRepository;

	public Long getForLogin(String username, String password) {
		UserLoginEntity ulEntity = uLRepository.findByUsernameAndPassword(username, password);

		if (ulEntity != null) {
			return ulEntity.getId();
			
		} else {
			return (long) 0;
		}
	}

}
