package com.ustglobal.stringclass;

public class TestA
{
	public static void main(String[] args)
	{
		String s1 = "Piyush";
		String s2 = "Ravi Ranjan";

		String s3 = new String("Piyush");
		String s4 = new String("Piyush");
		String s5 = "Piyush";

		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s5));

		String s6 = s1.toLowerCase();
		System.out.println(s6);
		
		String s7 = s1.toLowerCase();
		System.out.println(s7);
		
		char c = s1.charAt(0);
		System.out.println(c);

		boolean b = s1.equalsIgnoreCase("PIYUsh");
		System.out.println(b);
		
		StringBuffer sb1 = new StringBuffer("Kavya");
		sb1.append(0);
		System.out.println(sb1);
	}
}

