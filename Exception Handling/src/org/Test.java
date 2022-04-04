package org;

class Test {
	public static void main(String[] args) {
		try{
			System.out.println(10/0);
		}
		catch(ArrayIndexOutOfBoundsException x){
			System.out.println("Invalid index posiiton");
		}
		catch(ClassCastException x){
			System.out.println("Invalid Subclass");
		}
		catch(ArithmeticException x){
			System.out.println("Invalid Denominator");
		}
		catch(Exception x){
			System.out.println("Invalid");
		}
	}
}
