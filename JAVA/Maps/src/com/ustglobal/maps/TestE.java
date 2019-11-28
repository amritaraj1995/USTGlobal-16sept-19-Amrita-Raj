package com.ustglobal.maps;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TestE {
	public static void main(String[] args) {
		
		TreeMap<String, Integer> lh = new TreeMap<String, Integer>();
		lh.put("Banglore", 560068);
		lh.put("Hariyana", 134203);
		lh.put("Patna", 880000);
//		lh.put(null, 787889);                 NullPointerException
		
		for(Map.Entry<String,Integer> m : lh.entrySet()) {
			String key = m.getKey();
			Integer value = m.getValue();
			 System.out.println("Key is "+key);
			 System.out.println("Value is "+value);
			 System.out.println("==============================================");
					 
			
		}
	}

}
