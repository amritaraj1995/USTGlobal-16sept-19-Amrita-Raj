package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {
	public static void main(String[] args) {

		Student s1 = new Student(2,"divya",67.89);
		Student s2 = new Student(5,"ambika",56.67);
		Student s3 = new Student(12,"madhu",45.7);
		Student s4 = new Student(34,"akanksha",78.9);
		Student s5 = new Student(1,"amrita",35.67);
		Student s6 = new Student(8,"amisha",67.8);
		Student s7 = new Student(4,"aradhyaa",45.78);
		Student s8 = new Student(7,"anita",89.9);
		Student s9 = new Student(45,"astha",33.2);

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);

		ArrayList<Student> al1 = new ArrayList<Student>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		
		ArrayList<Student> al2 = new ArrayList<Student>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);


		HashMap<String, ArrayList<Student>> hm = new HashMap<>();
		hm.put("first",al);
		hm.put("second",al1);
		hm.put("third",al2);
		

		ArrayList<Student> second = hm.get("second");
		
		Iterator<Student> it = second.iterator();
		
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is : "+s.id);
			System.out.println("name is : "+s.name);
			System.out.println("Pesrcentage is : "+s.percentage);
			System.out.println("================================");
		}



	}

}
