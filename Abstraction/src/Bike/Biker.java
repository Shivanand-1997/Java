package Bike;

abstract class Biker {//Abstract class
	abstract void run();
}
class Safe extends Biker{
	@Override
	void run(){
		System.out.println("Safely running from Police");
	}
}
class TestBike{
	public static void main(String[] args) {
		Biker s = new Safe();//Upcasting
		s.run();
	}
}