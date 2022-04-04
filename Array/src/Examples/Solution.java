package Examples;

class Solution {
	public static void main(String[] args) {
		ConstuctorInArray s1 = new ConstuctorInArray(20, "Tom");
		ConstuctorInArray s2 = new ConstuctorInArray(21, "Jerry");
		ConstuctorInArray s3 = new ConstuctorInArray(23, "jack");
		
		ConstuctorInArray[] s= {s1,s2,s3};
		for (int i=0; i<s.length;i++){
			System.out.println("The age of "+s[i].name+" is "+s[i].age);
			
			
		}
//		we can use below method also
//		ConstuctorInArray[] s= new ConstuctorInArray[3];
//		s[0]=s1;
//		s[1]=s2;
//		s[2]=s3;
//		System.out.println(s[0].age+s[0].name);
//		System.out.println(s[1].age+s[1].name);
//		System.out.println(s[2].age+s[2].name);
	}
}
