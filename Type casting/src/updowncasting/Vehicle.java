package updowncasting;
class Car{
	String brand = "BMW";
	
	void start(){
		System.out.println("Car Starts");
	}
}
class Bike extends Car{
	String cost = "5Cr";
	
	void stop(){
		System.out.println("Bike stops");
	}
}
class Vehicle {
	public static void main(String[] args) {
	Car c =	new Bike();
	System.out.println(c.brand);
	c.start();
	Bike b = (Bike) c;
	System.out.println("The car model:- "+c.brand+" will cost around "+b.cost);
	b.start();
	b.stop();
	}

}
