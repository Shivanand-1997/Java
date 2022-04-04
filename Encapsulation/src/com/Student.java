package com;

public class Student {
	private int age = 20;
	
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
}

class Display extends Student{
	public static void main(String[] args) {
		Student s = new Student();
		s.setAge(60);
		System.out.println("Age:--"+s.getAge());
	}
}