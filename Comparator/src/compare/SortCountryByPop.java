package compare;

import java.util.Comparator;

class SortCountryByPop implements Comparator<Country> {

	@Override
	public int compare(Country x, Country y){
		return x.population.compareTo(y.population);
	}
}
