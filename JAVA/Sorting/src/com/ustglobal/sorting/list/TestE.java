package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestE {
	public static void main(String[] args) {

		LinkedList<Pen> ll = new LinkedList<Pen>();
		Pen p1 = new Pen(300 , "Parker");
		Pen p2 = new Pen(10 , "Writometer");
		Pen P3 = new Pen(10, "link Gliser");
		Pen p4 = new Pen(20,"Gel Pen");

		ll.add(p1);
		ll.add(p2);
		ll.add(P3);
		ll.add(p4);

		System.out.println("Before sort----------------->");
		displayPenDetails(ll);
		Collections.sort(ll);
		System.out.println("After sort ----------------->");
		displayPenDetails(ll);

	}

	static void displayPenDetails(LinkedList<Pen> p) {

		Iterator<Pen> it = p.iterator();
		while(it.hasNext()) {
			Pen pe = it.next();
			System.out.println("Bbrand is : "+pe.brand);
			System.out.println("Price  is : "+pe.price);
		}

	}

}


