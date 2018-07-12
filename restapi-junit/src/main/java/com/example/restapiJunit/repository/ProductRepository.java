package com.example.restapiJunit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restapiJunit.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>
{

}
