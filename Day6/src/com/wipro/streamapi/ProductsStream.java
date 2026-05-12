package com.wipro.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductsStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ProductList> list=getProductList();
		//List<ProductList> res=list
	Map<String,Double>map=list
	    .stream()
	    .collect(Collectors.groupingBy(ProductList::getProdCat,Collectors.averagingDouble(ProductList::getPrice))); //counting
	   // .sorted(Comparator.comparing(ProductList::getProdCat).reversed()) sorting
		//res.forEach(System.out::println);
	map
	.entrySet()
	.stream().forEach(System.out::println);
    }
	
	static List<ProductList> getProductList(){
		List<ProductList> list=new ArrayList<>();
		list.add(new ProductList("Smartphone", "Electronics", "Samsung", 32000));
		list.add(new ProductList("Noise Cancelling Headphones", "Electronics", "Sony", 5500));
		list.add(new ProductList("Smartwatch", "Electronics", "Apple", 28000));
		list.add(new ProductList("Bluetooth Speaker", "Electronics", "JBL", 3500));
		list.add(new ProductList("Running Shoes", "Footwear", "Nike", 4200));
		list.add(new ProductList("Formal Leather Shoes", "Footwear", "Bata", 2800));
		list.add(new ProductList("Classic Sneakers", "Footwear", "Adidas", 3500));
		list.add(new ProductList("Sandals", "Footwear", "Woodland", 1500));
		list.add(new ProductList("Laptop Backpack", "Bags", "American Tourister", 1800));
		list.add(new ProductList("Leather Handbag", "Bags", "Caprese", 2500));
		list.add(new ProductList("Gym Duffel Bag", "Bags", "Puma", 1200));
		list.add(new ProductList("Messenger Bag", "Bags", "Wildcraft", 1600));
		
		return list;
	}

}
