package CLASS;

class Car {
	int price= 3400000;
	String brand= "BMW S1000RR M sport edition";
	int modelYear=2021;
	public static void main(String[] args) {
		Car b= new Car();
		System.out.println("My "+b.brand+" "+b.modelYear+" Model");
		System.out.println("Cost me around: "+b.price);
	}
	

}
