package updowncasting;
class India{
	String pm = "Modi";
}
class Kar extends India{
	String cm1 = "Bommai";
}
class Tamil extends India{
	String cm2 = "Stalin";
}
class Goa extends India{
	String cm3 ="Sawant";
}

class DisplayStates {
	static void selectstate(India obj){
		if(obj instanceof Kar){
			Kar k = (Kar) obj;
			System.out.println("Prime Minister of India is:- "+obj.pm);
			System.out.println("Chief Minister of Karnataka:- "+k.cm1);
			System.out.println("-----------------");
		}
		else if(obj instanceof Tamil){
			Tamil t = (Tamil) obj;
			System.out.println("Prime Minister of India is:- "+obj.pm);
			System.out.println("Chief Minister of Karnataka:- "+t.cm2);
			System.out.println("-----------------");
		}
		else if(obj instanceof Goa){
			Goa g = (Goa) obj;
			System.out.println("Prime Minister of India is:- "+obj.pm);
			System.out.println("Chief Minister of Karnataka:- "+g.cm3);
		}
	}
	public static void main(String[] args) {
		selectstate(new Kar());
		selectstate(new Tamil());
		selectstate(new Goa());
	}
}
