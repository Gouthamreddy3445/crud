package com.springbootcrud.springbootcrudexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootcrud.springbootcrudexample.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
