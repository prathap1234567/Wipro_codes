package com.wipro.factory;

public class ShapeFactory {
	static Shape getObject(String type)
	{
		if(type.equalsIgnoreCase("CI"))
		{
			return  new Circle();
		}
		else if(type.equalsIgnoreCase("RE"))
		{
			return new Rectangle();
		}
		else if(type.equalsIgnoreCase("EL"))
		{
			return new Ellipse();
		}
		else
		{
			return null;
		}
	}

	
}
