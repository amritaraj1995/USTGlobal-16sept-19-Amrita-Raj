package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
	public static void main(String[] args) {


		TreeSet ts = new TreeSet();
		ts.add(34);
		ts.add(45);
		ts.add(12);
		ts.add(9);
		ts.add(39);
//  null not allowed and non generic not allowed
//		ts.add("deepika");   ClassCastException
//		ts.add(null);     NullPointerEception

		System.out.println("*******************using for each*************");
		for(Object s:ts) {
			System.out.println(s);


		}
		System.out.println("****************using iterator********************");
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			Object p = it.next();
			System.out.println(p);
		}

	}
}
