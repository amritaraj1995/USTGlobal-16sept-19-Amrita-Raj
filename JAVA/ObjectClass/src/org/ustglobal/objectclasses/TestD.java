package org.ustglobal.objectclasses;

public class TestD 
{
	public static void main(String[] args)
	{
		Student s = new Student(10,"kiyan",90.9);
		int h = s.hashCode();
		System.out.println(h);  //print id
		System.out.println("*************************");
		System.out.println(s);
		
	}
}
