package com.wipro.d8_assignment2part1_prathap_k;

public class RobotWorker implements IWorker{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		  System.out.println("working");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("robot cannot eat");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("sleeping");
		
	}

	@Override
	public void assembleProduct() {
		// TODO Auto-generated method stub
		 System.out.println("Assembling product");
		
	}

	@Override
	public void driveForklift() {
		// TODO Auto-generated method stub
		System.out.println("drive for lift");
		
	}

	@Override
	public void code() {
		// TODO Auto-generated method stub
		System.out.println("code required");
		
	}

}
