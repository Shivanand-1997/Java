package compare;

import java.util.TreeSet;

class SortCountry {
	

	public static void main(String[] args) {
		
		TreeSet<Country> t = new TreeSet<Country>(new SortCountryByPop());
		
		t.add(new Country(135.7, "India "));
		t.add(new Country(145.7, "China "));
		t.add(new Country(36.7, "USA "));

		for(Country c : t){
			System.out.println(c);
		}
	}
}
