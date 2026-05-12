package com.wipro.Builder;

public class CarBuilder {

	 String make;
	 int numberOfWheels;
	 String fuelType;
	 int cylinderCapacity;

	 public String getMake() {
		return make;
	}

	 public CarBuilder setMake(String make) {
		 this.make = make;
		 return this;
	 }

	 public int getNumberOfWheels() {
		 return numberOfWheels;
	 }

	 public CarBuilder setNumberOfWheels(int numberOfWheels) {
		 this.numberOfWheels = numberOfWheels;
		 return this;
	 }

	 public String getFuelType() {
		 return fuelType;
	 }

	 public CarBuilder setFuelType(String fuelType) {
		 this.fuelType = fuelType;
		 return this;
	 }

	 public int getCylinderCapacity() {
		 return cylinderCapacity;
	 }

	 public CarBuilder setCylinderCapacity(int cylinderCapacity) {
		 this.cylinderCapacity = cylinderCapacity;
		 return this;
	 }

	 Car build()
		{
			return new Car(this);
		}


}
