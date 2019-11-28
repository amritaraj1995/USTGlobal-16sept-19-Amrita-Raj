package com.ustglobal.mysingleton;

public class Test {
	public static void main(String[] args) {

		MySingleton ms = new MySingleton.getDbConnection();
		ms.s = "Hello";
		System.out.println("HashCode of ms "+ms.hashCode());

		MySingleton mx = new MySingleton.getDbConnection();
		mx.s = "Hi";
		System.out.println("HashCode of mx " +mx.hashCode());

		System.out.println(ms.s);
		System.out.println(mx.s);

	}
}