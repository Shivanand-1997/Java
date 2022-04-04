package org;

import java.util.Scanner;

class Demo {
	public static void main(String[] args) {
		System.out.println("Start");
		Scanner scan = new  Scanner(System.in);
		System.out.println("Enter a:");
		int a = scan.nextInt();
		System.out.println("Enter b:");
		int b = scan.nextInt();
		scan.close();
		try{
			System.out.println(a/b);
		}
		catch(Exception e){
			System.out.println("Invalid Denominator");
		}
	}
}
