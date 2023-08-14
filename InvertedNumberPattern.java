class InvertedNumberPattern{
	
	public static void main(String[] args){

		int i=1,n=4;

		while(i<=n){  //i<=n

		  int j=i;
		  int t=4;

		  while(j>=n-i+1){

		  	System.out.print(j);
		  	j++;
		  }
		  System.out.println();
		  i++;
		}
	}
}

//It is not solved