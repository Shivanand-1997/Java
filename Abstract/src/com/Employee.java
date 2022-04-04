package com;

abstract class Developer{
	Developer(){
		System.out.println("Hello");
	}
}
class Employee  extends Developer{
	public static void main(String[] args) {
		new Employee();
	}
}
