package com.ustglobal.hasarelationship.weak.car;

public class TestA 
{
	public static void main(String[] args) 
	{
		Music m = new Music();
		System.out.println(m.name);
		m.sound();
		m.play();
		System.out.println("=========================");
		m.c.move();                 //Has a relation
		
	}
}
