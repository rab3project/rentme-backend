package com.rentme.services;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rentme.dtos.ProductDto;
import com.rentme.entities.ProductEntity;
import com.rentme.entities.UserLoginEntity;
import com.rentme.repositories.ProductRepository;
import com.rentme.repositories.UserLoginRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository pRepository;

	@Autowired
	private UserLoginRepository uRepo;

	public void addProducts(Long id, ProductDto pdto) {
		Optional<UserLoginEntity> uEntity = uRepo.findById(id);

		ProductEntity pEntity = new ProductEntity();
		pEntity.setName(pdto.getName());
		pEntity.setDescription(pdto.getDescription());
		pEntity.setImageHttp(pdto.getImageHttp());
		pEntity.setPricePerDay(pdto.getPricePerDay());
		pEntity.setRentCount(pdto.getRentCount());
		pEntity.setRentedIndicator(false);
		pEntity.setUploadDate(new Date());
		pEntity.setUserLogin(uEntity);

		pRepository.save(pEntity);
	}

}
