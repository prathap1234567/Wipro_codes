package com.wipro.dependencyinversion;

public class Test {

	static Charger charger;
	static void setCharger(Charger chargertouse) {
		charger=chargertouse;
	}
	static void startCharging() {
		charger.charge();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Charger c=new ChargerTypeD();
    setCharger(c);
    startCharging();
	}

}
