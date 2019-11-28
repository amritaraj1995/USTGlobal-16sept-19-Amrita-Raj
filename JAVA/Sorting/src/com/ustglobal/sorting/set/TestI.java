package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
	public static void main(String[] args) {
		
		SortByName sb = new SortByName();
		SortByMicr sm = new SortByMicr();
		SortByPincode sp = new SortByPincode();
		
		TreeSet<Bank> ts = new TreeSet<Bank>(sb);
		
		Bank b1 = new Bank("SBI", 823002, 123456789);
		Bank b2 = new Bank("HDFC", 67899, 123478789);
		Bank b3 = new Bank("AXIS", 123456, 123976789);
		Bank b4 = new Bank("MBGB", 787657, 1234666689);
		Bank b5 = new Bank("CANERA", 787687, 1294566689);

		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b5);

		System.out.println("****************using Iterator**************");

		Iterator<Bank> it = ts.iterator();
		while(it.hasNext()) {
			Bank b = it.next();
			System.out.println("Name is : "+b.name);
			System.out.println("Pincode is : "+b.pincode);
			System.out.println("MICR is : "+b.micr);
			System.out.println("===========================================");
		}
	}

}
