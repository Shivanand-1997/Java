package org;

class Reverse {

	public static void main(String[] args) {

		String s = "Java";
		char[] ch = s.toCharArray();
		for(int i=ch.length-1; i>=0; i--){
			System.out.print(ch[i]);
		}
		String s1 = "Shivanand";
		String s2 = "";
		for(int i=s1.length()-1; i>=0; i--){
			s2= s2+s1.charAt(i);
		}
		System.out.println("\n"+s2);
	}
}
