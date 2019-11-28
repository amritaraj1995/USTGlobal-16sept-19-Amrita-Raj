package com.ustglobal.exception.first;

public class TestD
{
	public static void main(String[] args) 
	{
		System.out.println("Main Started");
		int[] a = {10,20,30};
		int b = 10;
		try
		{
			System.out.println(a[2]);
			System.out.println(b/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("number ddived by zero");
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("array index not present");
		}
		
		
		System.out.println("Main Started");
	}

}
