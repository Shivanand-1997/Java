package Calculation;

import java.util.Scanner;

interface Calculator {
	int add(int a, int b);
	int sub(int a, int b);
	int mul(int a, int b);
	int div(int a, int b);
}
class Calc implements Calculator{
	public int add(int a, int b){
		return a+b;

	}
	public int sub(int a, int b){
		return a-b;
	}
	public int mul(int a, int b){
		return a*b;
	}
	public int div(int a, int b){
		return a/b;
	}
}

class Solution{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Calculator obj = new  Calc();
		while(true){
			System.out.println("1: Addition\n2: Substraction\n3: Multiplication\n4: Division\n5: Exit");
			System.out.println("Enter your choice");
			int choice = scan.nextInt();
			int x=0;
			int y=0;
			if (choice<=4&&choice>=1){
				System.out.println("Enter 2 No's");
				x = scan.nextInt();
				y = scan.nextInt();
				scan.close();
			}
			switch(choice){
			case 1:
				System.out.println("The Sum of "+x+" & "+y+" is:- "+obj.add(x, y));
				break;
			case 2:
				System.out.println("The Substraction of "+x+" & "+y+" is:- "+obj.sub(x, y));
				break;
			case 3:
				System.out.println("The Multiplication of "+x+" & "+y+" is:- "+obj.mul(x, y));
				break;
			case 4:
				System.out.println("The Division of "+x+" & "+y+" is:- "+obj.div(x, y));
				break;
			case 5:
				System.out.println("Thank you!");
				System.exit(0);
			default:
				System.out.println("Invalid choice");

			}

		}
	}
}







