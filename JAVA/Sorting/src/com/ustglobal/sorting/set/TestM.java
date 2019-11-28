package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestM {
	public static void main(String[] args) {
		
		Comparator<EmployeeOne > comp = (e1,e2) -> {
			return e1.name.compareTo(e2.name);
		};
		
		
		
		
		TreeSet<EmployeeOne> ts = new TreeSet<EmployeeOne>();

		EmployeeOne e1 = new EmployeeOne(4, "niki", 5.6);
		EmployeeOne e2 = new EmployeeOne(1,"bhaskar",5.2);
		EmployeeOne e3 = new EmployeeOne(5,"suresh",5.1);
		EmployeeOne e4 = new EmployeeOne(2,"divesh",4.5);

		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);

		System.out.println("********************Using Iterator*******************");
		Iterator<EmployeeOne> it = ts.iterator();
		while(it.hasNext()) {
			EmployeeOne e = it.next();
			System.out.println("Name is : "+e.name);
			System.out.println("Id is : "+e.id);
			System.out.println("Height is : "+e.height);
			System.out.println("===========================================");
		}
	}

}
