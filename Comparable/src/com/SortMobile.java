package com;

import java.util.TreeSet;

class SortMobile {

	public static void main(String[] args) {
		
		TreeSet<Mobile> t = new TreeSet<>();
		
		t.add(new Mobile(38000, "Oneplus"));
		t.add(new Mobile(2000, "Nokia"));
		t.add(new Mobile(100000, "Apple"));

		for(Mobile mbl : t){
			System.out.println(mbl);
		}
		
	}
}
