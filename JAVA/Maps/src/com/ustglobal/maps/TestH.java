package com.ustglobal.maps;

import java.util.Hashtable;

public class TestH {
	
	public static void main(String[] args) {
		
		Hashtable<Integer , String> ht = new Hashtable<Integer , String>();
		ht.put(101, "ajay");
		ht.put(102, "sonu");
		ht.put(100, "monu");
		ht.put(106, "sriram");
		ht.put(99, "vijay");
		ht.put(105, "phuwanti");
		ht.put(208, "radha");
//		ht.put(108, null);              we can not have null value in hashTable
//		ht.put(null, "john");          we can not  add even one null key in hashTable
		
		
		System.out.println("Data : "+ht);
	}

}
