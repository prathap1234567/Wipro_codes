package com.wipro.restdemo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.restdemo.entity.Product;
import com.wipro.restdemo.repo.ProductRepo;
import com.wipro.restdemo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Autowired
	ProductRepo productRepo;

	@Override
	public List<Product> findAll() {
		return productRepo.findAll();
	}

	@Override
	public Optional<Product> findById(int id) {
		return productRepo.findById(id);
	}

	@Override
	public String update(Product p) {
		if(p.getPrice()<=0 || p.getQuantity()<0) {
			return "Invalid Data";
		}
		return productRepo.update(p);
	}

	@Override
	public void deleteById(int id) {
		productRepo.deleteById(id);
		
	}

	@Override
	public String save(Product p) {
		if(p.getPrice()<=0 || p.getQuantity()<0) {
			return "Invalid Data";
		}
		productRepo.save(p);
		return "Added Successfully";
	}
}