package compare;

import java.util.Comparator;

class SortCarBycost implements Comparator<Car> {

	@Override
	public int compare(Car x, Car y){
		
		return x.cost - y.cost;
	}
	
}

