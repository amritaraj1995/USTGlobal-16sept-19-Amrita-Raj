package com.ustglobal.thread.properties;

public class MyIdThread extends Thread{
	
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		System.out.println(Thread.currentThread().getId());
		
		MyIdThread mi = new MyIdThread();
		System.out.println("my id thread "+mi.getId());
		
		/* mi.setId(); */
		System.out.println("priority " +Thread.currentThread().getPriority());
//		Thread.currentThread().setPriority(16); IllegalArgumentException
		
		System.out.println("main ended");
	}

}
