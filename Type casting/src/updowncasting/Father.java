package updowncasting;

class Father {
	int age = 60;
}
class Son extends Father{
	String name = "Tom";
}

class Solution{
	public static void main(String[] args) {
		Father f =	new Son();
		System.out.println(f.age);
		Son s = (Son) f;
		System.out.println(s.name+" "+s.age);
	}
}
