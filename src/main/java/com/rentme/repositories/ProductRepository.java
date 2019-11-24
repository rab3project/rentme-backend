package com.rentme.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rentme.entities.ProductEntity;

@Repository
@Transactional
public interface ProductRepository extends CrudRepository<ProductEntity, Long> {

}
