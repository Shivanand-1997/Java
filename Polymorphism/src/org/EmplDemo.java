package org;

//Run Time Polymorphism
// class then IS A RElationship
// then upcasting
class Employee{
	void work(){
		System.out.println("WORKING");
	}
}
class Developer extends Employee{

	void work(){
		System.out.println("Developing App");
	}
}
class Tester extends Employee{

	void work(){
		System.out.println("Testing App");
	}
}
class EmplDemo {
	static void display(Employee obj){
		obj.work();
	}
	public static void main(String[] args) {
		display(new Developer());
		display(new Tester());
		System.out.println("----------------------");
		Employee emp;
		emp=new Developer();
		emp.work();
		emp=new Tester();
		emp.work();
		System.out.println("----------------------");
		Employee e1=new Developer();
		Employee e2=new Tester();
		e1.work();
		e2.work();
	}
}
