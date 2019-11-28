package com.ustglobal.arrays;

public class TestB 
{
	public static void main(String[] args) 
	{
		int[] nums = {10,20,30,40};
	//	System.out.println(nums[10]);  ArrayIndexOutOfoundException
		receive(nums);
		int[] values = getArray();
		
		for(int val :values)
		{
			System.out.println(val);
		}
	}
	static void receive(int[] numbers)
	{
		for(int num : numbers)
		{
			System.out.println(num);
		}
	}
	//how to return array
	static int[] getArray()
	{
		int[] values = {20,30,40,50};
		return values;
	}
	
	//write a method to return sting array
	
	

}
