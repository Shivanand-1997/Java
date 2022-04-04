package Methodoverloading;

import java.util.Scanner;

class Sum {
	void add(int x, int y) {
		System.out.println("The sum of " + x + " and " + y + " is " + (x + y));
	}

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++){	
			Scanner scan = new Scanner(System.in);
			Sum obj = new Sum();
			System.out.println("enter the two number");
			int a = scan.nextInt();
			int b = scan.nextInt();
			obj.add(a, b);
			scan.close();
		}
		
		
	}

}
