package com;

class Account {

	int acc= 123;
	private static Account obj;
	private Account(){
		System.out.println("Account created");
	}
	
	public static Account createObj(){
		if(obj==null){
			obj = new Account();
			}
		return obj;
	}
	public static void main(String[] args) {
			Account obj = Account.createObj();
			System.out.println("Account number:-- "+obj.acc);
	}
}
