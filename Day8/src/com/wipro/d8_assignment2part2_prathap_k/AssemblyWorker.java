package com.wipro.d8_assignment2part2_prathap_k;

public class AssemblyWorker implements Iworkable,IEatable,ISleepable,IAssemblyWorker{

	@Override
	public void assembleProduct() {
		// TODO Auto-generated method stub
		   System.out.println("Assembling product");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		 System.out.println("Assembly worker sleeping");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		 System.out.println("Assembly worker eating");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		 System.out.println("Assembly worker working");
	}

}
