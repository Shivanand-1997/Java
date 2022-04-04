package lang;

class Student {

	int age;

	Student(int age){
		this.age=age;
	}

	public String toString(){
		return "Age is "+age;
	}
	public static void main(String[] args) {
		Student s = new Student(20);
		System.out.println(s);
		System.out.println(s.toString());

	}
}
