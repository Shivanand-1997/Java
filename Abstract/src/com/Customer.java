package com;

abstract class Uber {
	abstract void book();

}
abstract class  Paytm extends Uber {
	abstract void pay();
}

class Customer extends Paytm{

	void book(){
		System.out.println("Booking cab");
	}

	void pay(){
		System.out.println("Paying amount of 500");
	}
	public static void main(String[] args) {
		Customer c = new Customer();
		c.book();
		c.pay();
	}
}
