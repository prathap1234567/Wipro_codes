package com.wipro.adapter;

public class ChargerAdapter implements TypeCCharger {

	TypeDCharger typeDCharger;

	public ChargerAdapter(TypeDCharger typeDCharger){
		super();
		this.typeDCharger = typeDCharger;
	}
	@Override
	public void chargeTypeC(String data) {
		 
		String txt="""
				    Mobile connected with Type C Port
				    Adapter converting Type D to Type C
				    """
				    +data;	
		typeDCharger.charge(txt);
	}

}