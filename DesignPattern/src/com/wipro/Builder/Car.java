package com.wipro.Builder;

public class Car {

   String make;
   int numberOfWheels;
   String fuelType;
   int cylinderCapacity;
   
   public Car(String make, int numberOfWheels, String fuelType, int cylinderCapacity) {
	super();
	this.make = make;
	this.numberOfWheels = numberOfWheels;
	this.fuelType = fuelType;
	this.cylinderCapacity = cylinderCapacity;
}
   public Car(CarBuilder builder) {
	// TODO Auto-generated constructor stub
	   super();
	   this.make=builder.make;
	   this.fuelType=builder.fuelType;
	   this.cylinderCapacity=builder.cylinderCapacity;
	   this.numberOfWheels=builder.numberOfWheels;
	   
}
   public String getMake() {
	return make;
   }
   public void setMake(String make) {
	this.make = make;
   }
   public int getNumberOfWheels() {
	return numberOfWheels;
   }
   public void setNumberOfWheels(int numberOfWheels) {
	this.numberOfWheels = numberOfWheels;
   }
   public String getFuelType() {
	return fuelType;
   }
   public void setFuelType(String fuelType) {
	this.fuelType = fuelType;
   }
   public int getCylinderCapacity() {
	return cylinderCapacity;
   }
   public void setCylinderCapacity(int cylinderCapacity) {
	this.cylinderCapacity = cylinderCapacity;
   }
   @Override
   public String toString() {
	return "Car [make=" + make + ", numberOfWheels=" + numberOfWheels + ", fuelType=" + fuelType + ", cylinderCapacity="
			+ cylinderCapacity + "]";
   }
   
   
}
