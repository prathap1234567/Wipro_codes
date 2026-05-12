package com.wipro.restdemo.service;

import java.util.List;
import java.util.Optional;

import com.wipro.restdemo.entity.Product;

public interface ProductService {

	List<Product> findAll();
	Optional<Product> findById(int id);
	String update(Product p);
	void deleteById(int id);
	String save(Product p);
}