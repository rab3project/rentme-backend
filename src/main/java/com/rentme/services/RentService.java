package com.rentme.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rentme.dtos.ProductDto;
import com.rentme.dtos.RentDto;
import com.rentme.entities.ProductEntity;
import com.rentme.entities.RentEntity;
import com.rentme.entities.UserLoginEntity;
import com.rentme.repositories.ProductRepository;
import com.rentme.repositories.RentRepository;
import com.rentme.repositories.UserLoginRepository;

@Service
public class RentService {

	@Autowired
	private ProductRepository pRepository;
	
	@Autowired 
	private RentRepository rRepository;
	
	@Autowired
	private UserLoginRepository uRepo;

	public List<ProductDto> viewAll() {

		List<ProductEntity> productEntity = (List<ProductEntity>) pRepository.findAll();
		List<ProductDto> pDtos = new ArrayList<ProductDto>();

		ProductDto pDto = new ProductDto();
		for (ProductEntity pEntity : productEntity) {
			pDto.setAll(pEntity.getName(), pEntity.getDescription(), pEntity.getImageHttp(), pEntity.getRentCount(),
					pEntity.getPricePerDay());
			pDtos.add(pDto);
		}

		return pDtos;

	}

	public void rentProduct(Long logId, Long pId, RentDto rentDto) {
		
		
		RentEntity rEntity = new RentEntity();
		
		Optional<UserLoginEntity> uEntity = uRepo.findById(logId);
		Optional<UserLoginEntity> pEntity = uRepo.findById(pId);
		
		
		rEntity.setRentFromDate(rentDto.getRentFromDate());
		rEntity.setRentToDate(rentDto.getRentToDate());
		rEntity.setTotalPrice(rentDto.getTotalPrice());
		
		
		if (uEntity.isPresent()){
		    UserLoginEntity newUEntity = uEntity.get();
		    rEntity.setUserLoginEntity(newUEntity);
		}
		else{
		   // alternative processing....
		}
		
		

		if (pEntity.isPresent()){
		    UserLoginEntity newPEntity = pEntity.get();
		    rEntity.setUserLoginEntity(newPEntity);
		}
		else{
		   // alternative processing....
		}
		
		rRepository.save(rEntity);
		
		
		
		
		
	}

}
