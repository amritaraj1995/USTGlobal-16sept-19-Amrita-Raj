package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.Vector;

public class TestJ {
	public static void main(String[] args) {

		TreeSet<Customer> ts = new TreeSet<Customer>();

		Customer c1 = new Customer("Amrita", 1, 40000);
		Customer c2 = new Customer("Atish", 2, 60000);
		Customer c3 = new Customer("Chandrika", 3, 200000);
		Customer c4 = new Customer("Dhanya", 4, 500000);
		Customer c5 = new Customer("Pooja", 5, 40000);

		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c5);

		System.out.println("****************using Iterator**************");

		Iterator<Customer> it = ts.iterator();
		while(it.hasNext()) {
			Customer c = it.next();
			System.out.println("Name is : "+c.name);
			System.out.println("Is is : "+c.id);
			System.out.println("Salary is : "+c.salary);
			System.out.println("===========================================");
		}
	}
}


