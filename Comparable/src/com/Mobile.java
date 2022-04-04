package com;

class Mobile implements Comparable<Mobile> {

	int cost;
	String brand;
	
	Mobile(int cost, String brand){
		this.cost= cost;
		this.brand= brand;
	}
	
	public String toString(){
		return "Cost of the "+brand+" is:-- "+cost;
	}
	
	public int compareTo(Mobile m){
		return this.cost - m.cost;
	}
}
