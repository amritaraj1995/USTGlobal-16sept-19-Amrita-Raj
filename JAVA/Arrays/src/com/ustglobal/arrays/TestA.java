package com.ustglobal.arrays;

public class TestA
{
	public static void main(String[] args) 
	{
		int[] nums = new int[5];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		
		for(int i = 0 ; i<nums.length ; i++)
		{
			System.out.println(nums[i]);
		}
		
		System.out.println("--------------------------------------");
		
		for(int num : nums)
		{
			System.out.println(num);
		}
		System.out.println("----------------------------------------");
		char[] ch = {'a','b','c','d'};
		for(int i = 0 ; i<ch.length ; i++)
		{
			System.out.println(ch[i]);
		}
		
		System.out.println("=======================================");
		for(int c : ch)
		{
			System.out.println(c);
		}
		
		System.out.println("======================================");
		boolean[] b = {true,false,true,false,true,false};
		
		System.out.println("---------------------------------------");
		
		double[] d = {12.5 , 5.47 , 78.7 , 89.9 , 78.5};
		for(double d1 : d)
		{
			System.out.println(d);
		}
		
		for(int x = 0 ; x<d.length ; x++)
		{
			System.out.println(d[x]);
		}
		
		System.out.println("-----------------------------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
