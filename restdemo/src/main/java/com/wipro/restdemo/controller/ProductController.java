package com.wipro.restdemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.restdemo.entity.Product;
import com.wipro.restdemo.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	ProductService productService;
			@GetMapping
				 List<Product> getProduct(){
				return productService.findAll();
			}
		@GetMapping("/{id}")
		Product findById(@PathVariable int id) {
			Optional<Product> opt=productService.findById(id);
			if (opt.isPresent()) {
				return opt.get();
			} else {
				return new Product();
			}
		
		}

	@PutMapping
	String putProduct(@RequestBody Product p) {
		  return productService.update(p);
	}
	@PostMapping
	String postProduct(@RequestBody Product p) {
		  return productService.save(p);
	}
	@DeleteMapping("/{id}")
	String deleteProduct(@PathVariable int id) {
		productService.deleteById(id);
		  return "Deleted Successfully";
	}
}