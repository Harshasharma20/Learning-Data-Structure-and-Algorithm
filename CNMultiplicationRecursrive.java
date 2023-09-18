class CNMultiplicationRecursrive{
	
	public static int  multiplication(int n, int m){
				

		if(m==0){
			
			return 0;
		}

		
		return (n + multiplication(n,m-1));


	}

	public static void main(String[] args){

		System.out.print(multiplication(5,3));
	} 
}