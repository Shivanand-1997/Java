package org;

//Method Overloading
class Amazon{
	void buy(String book){
		System.out.println(book+" Book by *Chetan Bhagat*\nI brought this on amazon ");
		
	}
	void buy(int cost){
		System.out.println("for "+cost);
		System.out.println("-----------------------------------------");
		System.out.println("-----------------------------------------");

	}
	void buy(String book, int cost){
		System.out.println(book+" Book by Chetan Bhagat\nI brought this on amazon for  "+cost);
		System.out.println("-----------------------------------------");
		System.out.println("-----------------------------------------");

		


	}
	void buy(int cost, String book){
		System.out.println(book+" Book by Chetan Bhagat\nI brought this on amazon for  "+cost);
		System.out.println("-----------------------------------------");
		System.out.println("-----------------------------------------");
	}
}
class MainClass {
	public static void main(String[] args) {
		Amazon a=new Amazon();
		a.buy("One Indian Girl");
		a.buy(120);
		a.buy(120, "One Indian Girl");
		a.buy("One Indian Girl", 120);
	}
}
