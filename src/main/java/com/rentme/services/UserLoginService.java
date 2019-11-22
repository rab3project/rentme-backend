package com.rentme.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rentme.dtos.UserLoginDto;
import com.rentme.repository.UserLoginRepository;

@Service
public class UserLoginService {
	
	@Autowired
	private UserLoginRepository uLRepository;

	public Boolean getForLogin(String username, String password) {
	
		UserLoginRepository.findByUsernameAndPassword(username, password);
		return true;
		
	}

}
