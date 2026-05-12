package com.wipro.d8_assignment2part2_prathap_k;

public class RobotWorker implements Iworkable,IAssemblyWorker,IDriver,Icoder {

	@Override
	public void code() {
		// TODO Auto-generated method stub
		System.out.println("Robot do code");
		
	}

	@Override
	public void driveForklift() {
		// TODO Auto-generated method stub
		System.out.println("robot drive");
		
	}

	@Override
	public void assembleProduct() {
		// TODO Auto-generated method stub
		 System.out.println("Assembling product");
	}

	

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("robot working");
		
	}

}
