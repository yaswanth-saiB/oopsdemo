package com.wipro.velocity.ims.repository;

import com.wipro.velocity.ims.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
