package com.rentme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rentme.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
