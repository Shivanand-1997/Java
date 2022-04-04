package lang;

class Hotel {

	int ratings;
	String name;
	
	Hotel(int ratings, String name){
		this.name=name;
		this.ratings=ratings;
	}
	
	public String toString(){
		return "The "+name+" has the "+ratings+" star ratings";
	}
	
	public static void main(String[] args) {
		Hotel h1 = new Hotel(5, "Taj");
		Hotel h2 = new Hotel(7, "Palace");

		
		System.out.println(h1.toString());
		System.out.println(h2.toString());

	}
}
