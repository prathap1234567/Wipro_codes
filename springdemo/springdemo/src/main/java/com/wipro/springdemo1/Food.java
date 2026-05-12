package com.wipro.springdemo1;

import org.springframework.stereotype.Component;

@Component
public class Food {
 String foodName;
 String foodType;
 @Override
public String toString() {
	return "Food [foodName=" + foodName + ", foodType=" + foodType + "]";
}
 public String getFoodName() {
	return foodName;
 }
 public void setFoodName(String foodName) {
	this.foodName = foodName;
 }
 public String getFoodType() {
	return foodType;
 }
 public void setFoodType(String foodType) {
	this.foodType = foodType;
 }
 
}
