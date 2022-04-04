package com;

public class Account {
	private int accno;
	private String name;
	private String email;
	private int amount;
	
	public void setAccNo(int accno){
		this.accno=accno;
	}
	public int getAccNo(){
		return accno;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return email;
	}
	public void setAmount(int amount){
		this.amount = amount;
	}
	public int getAmount(){
		return amount;
	}
}
class AHolder{
	public static void main(String[] args) {
		Account n = new Account();
		n.setAccNo(12645486);
		n.setName("Tom");
		n.setEmail("Tom@mail.com");
		n.setAmount(5600);
		System.out.println(n.getName()+" Account number "+n.getAccNo());
		System.out.println("Email:-- "+n.getEmail());
		System.out.println("The Package cost"+n.getAmount());
		
	}
}