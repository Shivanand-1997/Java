package com;

import java.util.TreeSet;

class SortCountry {
	public static void main(String[] args) {
		TreeSet<Country> t = new TreeSet();
		
		t.add(new Country("India"));
		t.add(new Country("Russia"));
		t.add(new Country("Indi"));
		t.add(new Country("Ind"));
		
		for(Country cy : t){
			System.out.println(cy);
		}
	}

}
