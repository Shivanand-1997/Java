package lang;

class Country {
	
	int population;
	String name;
	
	
	Country(int population, String name){
		this.name=name;
		this.population=population;
	}
	
	
	public String toString(){
		return "The "+name+" has a total population  of "+population;
	}
	
	public static void main(String[] args) {
		Country c1 = new Country(55000, "Turkey");
		Country c2 = new Country(58000, "Sikkim");
		Country c3 = new Country(590000000, "India");
		System.out.println("------------------------");
  
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println("---------------------");

		
		Country[] c = {c1,c2,c3};
		System.out.println("---------------------");
		for(int i=0; i<c.length; i++){
			System.out.println(c[i]);

		}
		System.out.println("------------------------");
		


	}
}
