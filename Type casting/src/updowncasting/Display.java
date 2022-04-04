package updowncasting;

class India{
	String pm="Narendra Modi";
}
class Kar extends India{
	String cm1="Mr.Bommai";
}
class Tamil extends India{
	String cm2= "Mr.Stalin";
} 
class Goa extends India{
	String cm3="Mr.Sawant";
}

class Display {
	public static void display(India obj){
		if(obj instanceof Kar){
			System.out.println("Prime minister of india:- "+obj.pm);
			Kar k = (Kar) obj;
			System.out.println("Chief minister of Karnataka:- "+k.cm1);
			System.out.println("------------------------------------");
		}
		else if (obj instanceof Tamil){
			System.out.println("Prime minister of india:- "+obj.pm);
			Tamil t = (Tamil) obj;
			System.out.println("Chief minister of Tamilanadu:- "+t.cm2);
			System.out.println("------------------------------------");
		}
		else if (obj instanceof Goa){
			System.out.println("Prime minister of india:- "+obj.pm);
			Goa t = (Goa) obj;
			System.out.println("Chief minister of Tamilanadu:- "+t.cm3);
		}
	}
	public static void main(String[] args) {
		display(new Kar());
		display(new Tamil());
		display(new Goa());
	}

}
