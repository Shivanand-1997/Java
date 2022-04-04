package compare;

class Car {

	int cost;
	
	Car(int cost){
		this.cost=cost;
	}

	@Override
	public String toString() {
		return "The car will cost me around:-- "+cost;
	}
}
