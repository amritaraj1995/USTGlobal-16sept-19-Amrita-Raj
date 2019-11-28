package com.ustglobal.mysingleton;

public class MySingleton {
	private static MySingleton instance = null;
	String s;
	MySingleton() {
		
	}
	
	public static MySingleton getDbConnection() {
		
		if(instance == null) {
			
			instance = new MySingleton();
			return instance;
		}else {
			return instance;
		}
		
	}
}
