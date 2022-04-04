package Banking;

import java.util.Scanner;

interface Bank {
	void deposit(int amount);
	void withdraw(int amount);
	void checkBalance();
}

class ATM implements Bank{
	int balance = 10000;
	
	public void deposit(int amount){
		balance += amount;
		System.out.println("Amount Deposit Succesful");
		System.out.println("--------------------------");
	}
	public void withdraw(int amount){
		if(balance>=amount){
			balance -= amount;
			System.out.println("Amount Withdraw Succesful");
			System.out.println("--------------------------");
		}
		else{
			System.out.println("Insufficient balance");
			System.out.println("Available balance is:-----"+balance);
		}

	}
	public void checkBalance(){
		System.out.println("Available balance is:--"+balance);
		System.out.println("--------------------------");

	}
}

class AccountHolder{
	public static void main(String[] args) {
		Bank obj=new ATM();
		Scanner scan= new Scanner(System.in);
		while(true){
			System.out.println("1:Deposit\n2: Withdraw\n3: Check Balance\n4: Exit \nEnter Your Choice ");
			System.out.println("------------------------");
			int choice = scan.nextInt();
			if (choice == 1){
				System.out.println("Enter the Amount you would like to deposit");
				int amount = scan.nextInt();
				obj.deposit(amount);
			}
			else if (choice == 2){
				System.out.println("Enter the Amount you would like to withdraw");
				int amount = scan.nextInt();
				obj.withdraw(amount);
			}
			else if (choice == 3){
				obj.checkBalance();
			}
			else if (choice == 4){
				System.out.println("THANK YOU FOR VISITING YES BANK ATM VISIT AGAIN");
				System.exit(0);
			}
			else {
				System.out.println("Invalid choice");
			}
		}
	}
}