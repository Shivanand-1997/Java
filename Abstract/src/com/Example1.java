package com;

abstract class Person{
	abstract void eat();
}
class Example1 extends Person {
	@Override
	void eat(){
		System.out.println("Eating Grapes");
	}
	public static void main(String[] args) {
		Example1 e =new Example1();
		e.eat();
	}
}
