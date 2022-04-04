package Examples;

class Sum {
	
	public static void main(String[] args) {
		int sum=0;
		int[] a={10, 20,30};
		for(int i=0;i<a.length;i++){
			sum = sum+a[i];
		}
		System.out.println(sum);
		System.out.println(sum/(a.length));
	}

}
//sum of n numbers and to find avg