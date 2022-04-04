package Rules;

class Static {
	static int a= 20;
	static String b = "Tom";

	static void study(){
		System.out.println("Studying");
	}

	public static void main(String[] args) {
		System.out.println(Static.a);
		System.out.println(Static.b);

		Static.study();


	}
}
