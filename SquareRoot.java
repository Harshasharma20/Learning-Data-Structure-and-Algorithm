class SquareRoot{
	public static void main(String[] args){
		int n = 16,root =0,i = 1, divisor = 0, quotient;
		while(i<n){
			if(n%i==0){
				divisor = i;
				quotient = n/i;
				root = divisor*quotient;
				if(divisor==quotient && root==n && i*i<=n){
					System.out.println(i);                  
				}
							
			}	 

			i++;
		}
	}

}