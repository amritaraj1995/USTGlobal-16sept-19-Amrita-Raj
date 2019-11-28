package org.ustglobal.objectclasses;

public class TestG 
{
	public static void main(String[] args)
	{
		Employee c1 = new Employee(1,"Aram", 1110000);
		
		Employee c2 = new Employee(2,"haram", 1120000);
		
		Employee c3 = new Employee(1,"hai", 1110000);
		
		Employee c4 = c3;
	
	
	boolean isEqual = c1.equals(c2);
	System.out.println(c1.equals(c3));
	System.out.println(c3.equals(c4));
	
	System.out.println(isEqual);
		
	}

}
