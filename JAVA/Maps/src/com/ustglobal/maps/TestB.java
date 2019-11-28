package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {

		HashMap hm = new HashMap();

		hm.put("kuku" , 9988866);
		hm.put("mala", 7769844);
		hm.put("kiyan", 77665544);


		HashMap hm1 = new HashMap();

		hm1.put("dipu" , 9988866);
		hm1.put("riya", 7769844);
		hm1.put("kirti", 77665544);

		boolean hasKey = hm.containsKey("mala");
		System.out.println("Has Key "+hasKey);

		boolean hasValue = hm.containsKey(7769844);
		System.out.println("Has value : "+hasValue);

		hm.putAll(hm1);
		System.out.println("=====================================");
		System.out.println("After put all "+hm);

		System.out.println(hm.size());

		boolean isEmpty = hm.isEmpty();
		System.out.println("Map is Empty : "+isEmpty);

		hm.clear();
		System.out.println("After clear "+hm);
	}


}
