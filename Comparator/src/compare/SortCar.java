package compare;

import java.util.TreeSet;

class SortCar {

	public static void main(String[] args) {
		
		TreeSet<Car> t = new TreeSet<>(new SortCarBycost());
		
		t.add(new Car(700));
		t.add(new Car(500));
		t.add(new Car(800));
		t.add(new Car(600));
		t.add(new Car(100));
		
		for(Car c : t){
		System.out.println(c);
		}
	}
}
