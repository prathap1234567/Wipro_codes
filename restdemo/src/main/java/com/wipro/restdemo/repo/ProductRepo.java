package com.wipro.restdemo.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.wipro.restdemo.entity.Product;

@Repository
public class ProductRepo {

	List<Product> listProduct=new ArrayList<>();
	public ProductRepo() {
		super();
		listProduct.add(new Product(1,"Laptop","Electronics",50000,5));
		listProduct.add(new Product(2,"Saree","Clothes",5000,7));
		listProduct.add(new Product(3,"Shoe","FootWear",2000,5));
	} 
	public List<Product> findAll(){
		return listProduct;
	}
	public Optional<Product> findById(int id){
		return listProduct
				.stream()
				.filter(p->p.getProductId()==id)
				.findFirst();
	}
	public void save(Product p) {
		listProduct.add(p);
	}
	public void deleteById(int id){
		    listProduct=listProduct
				.stream()
				.filter(p->p.getProductId()!=id)
				.toList();
	}
	public String update(Product p) {
		for(int i=0;i<listProduct.size();i++) {
			if(p.getProductId()==listProduct.get(i).getProductId()) {
				listProduct.set(i, p);
				return "Updated Successfully";
			}
		}
		return "Product Doesn't exist";
	}
}