package org.ustglobal.objectclasses;

public class TestH
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Person p1 = new Person(12,"ravi");
		System.out.println("p1 id "+p1.id);
		System.out.println("p1 name "+p1.name);
		
		Object o = p1.clone();
		Person p2 = (Person)o;
		System.out.println("p2 id is "+p2.id);
		System.out.println("p2 name is "+p2.name);	
		
		p2.id = 200;
		p2.name = "Surya";
		
		System.out.println("*********************After Cloning********************");
		
		System.out.println("p1 id "+p1.id);
		System.out.println("p1 name "+p1.name);
		
		System.out.println("p2 id is "+p2.id);
		System.out.println("p2 name is "+p2.name);	
		
		
	}
}
