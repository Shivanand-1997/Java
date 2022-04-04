package compare;

class Country {
	Double population;
	String name;
	
	Country(double population, String name){
		this.name = name ;
		this.population = population;
	}
	
	@Override
	public String toString(){
		return name+" total population is:-- "+population+" Crores";
	}
	

}
