package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"Atish",500000);
		Employee e2 = new Employee(12,"Raj",600000);
		Employee e3 = new Employee(13,"Amrita",800000);
		Employee e4 = new Employee(14,"Komal",40000);
		Employee e5 = new Employee(15,"Rashi",5400000);
		Employee e6 = new Employee(16,"Arpita",900000);
		Employee e7 = new Employee(17,"sakshi",700000);
		Employee e8 = new Employee(18,"Pooja",300000);
		Employee e9 = new Employee(19,"Aradhya",540000);
		
		ArrayList<Employee> al1 = new ArrayList<Employee>();
		al1.add(e1);
		al1.add(e2);
		al1.add(e3);
		
		ArrayList<Employee> al2 = new ArrayList<Employee>();
		al2.add(e4);
		al2.add(e5);
		al2.add(e6);
		
		ArrayList<Employee> al3 = new ArrayList<Employee>();
		al3.add(e7);
		al3.add(e8);
		al3.add(e9);
		
		HashMap<String, ArrayList<Employee>> hm = new  HashMap<String, ArrayList<Employee>>();
		hm.put("manager1", al1);
		hm.put("manager2", al2);
		hm.put("manager3", al3);
		
		ArrayList<Employee> manager1 = hm.get("manager1");
		
		Iterator<Employee> it = manager1.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("Id is : "+e.id);
			System.out.println("name is : "+e.name);
			System.out.println("Pesrcentage is : "+e.salary);
			System.out.println("================================");
		}
	}

}
