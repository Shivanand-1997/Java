package com;

class Country implements Comparable<Country>{
	
	String name;
	
	Country(String name){
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public int compareTo(Country c){
		return this.name.compareTo(c.name);
	}
}
