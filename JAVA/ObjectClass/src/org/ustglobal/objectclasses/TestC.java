package org.ustglobal.objectclasses;

public class TestC
{
	public static void main(String[] args) 
	{
		Marker m = new Marker();
		int h = m.hashCode();
		String s = m.toString();
		System.out.println(h);
		System.out.println(s);
		
		Marker p = new Marker();
		System.out.println(p);
	}

}
