package Examples;

public class Student {
	private int age=22;
	
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
}
class Example extends Student{
	public static void main(String[] args) {
		Student s = new  Student();
		
	}
}