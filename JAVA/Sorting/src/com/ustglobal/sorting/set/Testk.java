package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Vector;

public class Testk {
	public static void main(String[] args) {

		Vector v = new Vector();
		System.out.println(v.capacity());
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(12);
		pq.add(24);
		pq.add(35);
		pq.add(35);
		pq.add(1);


		System.out.println("**************************using iterator*******************");
		Iterator<Integer> it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(pq.poll());
		}
		System.out.println("After poll "+pq);

	}
}
