package Rules;

class Static3 {
	static double h1= 5.7;
	static int a1 = 23;
	static String n1= "Charan";
	static String n2="Sharan";
	static int a2 = 24;
	static double h2 = 5.4;

	static void Jspider(){
		System.out.println("Both are working hard");
	}
	public static void main(String[] args) {
		System.out.println("Name :"+Static3.n1);
		System.out.println("Height :"+ Static3.h1+ " Age :"+Static3.a1);
		System.out.println("Name :"+Static3.n2);
		System.out.println("Height :"+ Static3.h2+ " Age :"+Static3.a2);

		Static3.Jspider();
	}

}
