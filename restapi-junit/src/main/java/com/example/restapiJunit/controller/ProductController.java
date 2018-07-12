package com.example.restapiJunit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapiJunit.model.Product;
import com.example.restapiJunit.repository.ProductRepository;

@RestController
public class ProductController
{
	@Autowired
	ProductRepository productRepo;
	
	@GetMapping("/api/product/all")
	public List<Product> getAllProducts()
	{
		return productRepo.findAll ();
	}
	
	@GetMapping("/api/product/{id}")
	public Product getProduct(@PathVariable(name="id") Integer id)
	{
		return productRepo.findById (id).get ();
	}
}
