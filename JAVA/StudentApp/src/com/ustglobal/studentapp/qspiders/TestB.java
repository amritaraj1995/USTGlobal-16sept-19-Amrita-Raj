package com.ustglobal.studentapp.qspiders;
import com.ustglobal.studentapp.jspiders.*;
import com.ustglobal.studentapp.jspiders.Remote.*;
public class TestB 
{
	public static void main(String[] args) 
	{
		Remote.on();   //accessing the  on method from remote class
		System.out.println(Remote.num);
		
		Remote r = new Remote();
		System.out.println(r.num);
	}

}
