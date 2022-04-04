package com;

import java.util.TreeSet;

class Person implements Comparable<Person>{

	String name;
	Double height;
	
	Person(double height, String name){
		this.name= name;
		this.height = height;
	}

	@Override
	public String toString() {
		return "The "+name+ " height is "+height+"m";
	}
	
	public int compareTo(Person p){
		return this.height.compareTo(p.height);
//		return this.name.compareTo(p.name);
	}
	
	public static void main(String[] args) {
		TreeSet<Person> t = new TreeSet<>();
		
		t.add(new Person(1.63, "Tommy"));
		t.add(new Person(1.71, "Tison"));
		t.add(new Person(1.73, "Teddy"));
		
		for(Person ps : t){
			System.out.println(ps);
		}

	}
}
