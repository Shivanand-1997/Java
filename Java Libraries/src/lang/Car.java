package lang;

class Car {
	int cost;
	String brand;
	int yearModel;
	
	Car(int yearModel, String brand, int cost ){
		this.brand=brand;
		this.cost=cost;
		this.yearModel=yearModel;
	}
	
	public String toString(){
		return yearModel+" "+brand+" will cost me around:-- "+cost;
	}

	public static void main(String[] args) {
		Car c = new Car(2021, "BMW MSport S1000 RR", 57000000);
		System.out.println(c);
		System.out.println(c.toString());
	}
}
