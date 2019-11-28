package com.ustglobal.sorting.list;

import java.util.Comparator;

public class SortByColor implements  Comparator<Marker> {

	@Override
	public int compare(Marker o1, Marker o2) {
		
		String s = o1.Color;
		String t = o2.Color;
		return s.compareTo(t);
	}
	

}
