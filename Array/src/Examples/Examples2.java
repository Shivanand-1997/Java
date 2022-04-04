package Examples;

//just initialize and declaration examples on arrays
class Examples2 {
	public static void main(String[] args) {
		int[] a;
		a= new int[3];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		System.out.println("--------");
		a[1]=10;
		a[2]=50;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		System.out.println("-----");
		
		double[] x= new double[2];
		 System.out.println(x[0]);
		 System.out.println(x[1]);
		System.out.println("-----");
		
		 x[0]=100.5;
		 x[1]=200.3;
		 System.out.println(x[0]);
		 System.out.println(x[1]);
		
		
	}
}
