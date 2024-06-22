package com.productmanager.springproduct;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product ,Long> {

//List<Product> findAll();



}
