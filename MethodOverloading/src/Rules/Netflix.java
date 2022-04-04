package Rules;

class Netflix {
	void login(String id, int password){
		System.out.println("Logged in using the id and password");
	}
	void login(int contactno, int otp){
		System.out.println("Logged in using the number and otp");
	}
	
	public static void main(String[] args) {
		Netflix l = new Netflix();
		
		l.login(33559845, 8899);
		l.login("shiv", 5566);
		
	}

}
