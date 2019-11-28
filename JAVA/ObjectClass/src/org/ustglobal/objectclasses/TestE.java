package org.ustglobal.objectclasses;

public class TestE 
{
	public static void main(String[] args)
	{
		Car c1 = new Car(1700000,"Harrier","Black");
		int co1 = c1.hashCode();
		System.out.println(co1);  //print id
		
		System.out.println(c1);
		
		System.out.println("*************************");
		
		Car c2 = new Car(1200000,"Duster","Black");
		int co2 = c2.hashCode();
		System.out.println(co2);  //print id
	
		System.out.println(c2);
		
		System.out.println("*************************");

		Car c3 = new Car(2000000,"Fortuner","White");
		int co3 = c3.hashCode();
		System.out.println(co3);  //print id
	
		System.out.println(c3);
		
	}
}
