package Examples;

//to find the Occurence of a specific value

class Occurence {
	public static void main(String[] args) {
		int[] a={10,50,80,50,60,80,50,10};
		int element=10;
		int count=0;
		for(int i=0;i<a.length;i++){
			if(element==a[i]){
				count++;
			}
		}
		System.out.println("The count:- "+count);
	}
}
