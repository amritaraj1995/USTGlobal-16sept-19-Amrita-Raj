package com.ustglobal.sorting.list;

import java.util.LinkedList;

public class TestC {
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(12);
		l.add(23);
		l.add(34);
		l.add(25);
		
		Integer peekElement = l.peek();
		System.out.println("Peek element : "+peekElement);
		
		Integer peekFirstElement = l.peekFirst();
		System.out.println("Peek first Element : "+peekFirstElement);
		
		Integer peekLastElement = l.peekLast();
		System.out.println("Peek last element : "+peekLastElement);
		
		System.out.println("After peek ---->"+l);
		
		
		
		Integer pollElement = l.poll();
		System.out.println("Poll element : "+pollElement);
		
		Integer pollFirstElement = l.pollFirst();
		System.out.println("Poll first Element : "+pollFirstElement);
		
		Integer pollLastElement = l.pollLast();
		System.out.println("Poll last element : "+pollLastElement);
		
		System.out.println("After poll ---->"+l);
		
		l.push(12);
		System.out.println("After push----> "+l);
		Integer p  = l.pop();
		System.out.println(p);
		System.out.println("After pop ----->"+l);
				
	}

}
