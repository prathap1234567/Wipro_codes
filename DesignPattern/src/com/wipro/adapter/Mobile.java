package com.wipro.adapter;

public class Mobile {

	public static void main(String[] args) {
		 
      	TypeDCharger charger = new TypeDCharger();
      	ChargerAdapter chargerAdapter=new ChargerAdapter(charger);
      	chargerAdapter.chargeTypeC("Charging Started");
	}

}
