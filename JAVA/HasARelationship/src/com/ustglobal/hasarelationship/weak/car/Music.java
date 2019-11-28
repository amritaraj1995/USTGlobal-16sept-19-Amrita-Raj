package com.ustglobal.hasarelationship.weak.car;

public class Music 
{
	String name;
	Car c = new Car();
	
	void sound()
	{
		System.out.println("music sound()");
	}
	
	void  play()
	{
		System.out.println("music play()");
	}
}
