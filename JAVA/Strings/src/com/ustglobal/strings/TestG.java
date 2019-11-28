package com.ustglobal.strings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestG {
	public static void main(String[] args) {

		ArrayList<Employee> al =  new ArrayList<Employee>();

		Employee e1 = new Employee(1, "veeru");
		Employee e2 = new Employee(2, "jai");
		Employee e3 = new Employee(3, "basanti");
		Employee e4 = new Employee(4, "thakur");

		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);

		Comparator<Employee> cmp = (e5,e6) -> {
			return e1.name.compareTo(e6.name);
		};

		List<Employee> l = al.stream().sorted(cmp).collect(Collectors.toList());
		Iterator<Employee> it = l.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("Id is : "+e.id);
			System.out.println("Name is : "+e.name);
			System.out.println("Sorted-------------------");
			
		}

	}
}