package com.ustglobal.assignment.collectionframework;

import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class TestEmployee {
	
	ArrayList<Employee> al = new ArrayList<Employee>();
	Employee e1 = new Employee(1, "Amrita", 882533082);
	Employee e2 = new Employee(2, "Alice", 882788082);
	Employee e3 = new Employee(3, "Pooja", 882976082);
	
	al.add(e1);
	
}
	for(int i=0 ; i< al.size() ; i++) {
		Employee e = e1.get(i);
		System.out.println("eid = "+e.eid);
		System.out.println("Name = "+e.name);
		System.out.println("number = "+e.no);
	}
	
	for(Employee e : e1) {
		System.out.println(e1);
	}
	

}
