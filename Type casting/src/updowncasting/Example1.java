package updowncasting;

class Father{
	String name = "Tom";
	
	void House(){
		System.out.println("Father owns the house");
	}
}
class Son extends Father{
	int  age = 20;
	
	void Bike(){
		System.out.println("Son owns the bike ");
	}
}
public class Example1 {
	static void display(Father obj){
		if(obj instanceof Son){
			System.out.println("Father name:- "+obj.name);
			obj.House();
			Son s = (Son) obj;
			System.out.println("Son age is:- "+s.age);
			s.House();
			s.Bike();
		}
	}
	public static void main(String[] args) {
		display(new Son());
	}

}
