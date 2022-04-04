package Rules;

class StaticNew {
		static int a = 23;
		static String b= "Shiva";
		
		static void Student(){
			System.out.println("Working");
			
		}
		public static void main(String[] args) {
			System.out.println(StaticNew.a);
			System.out.println(StaticNew.b);
			
			StaticNew.Student();
		}
}
