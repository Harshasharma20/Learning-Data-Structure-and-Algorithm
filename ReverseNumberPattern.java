class ReverseNumberPattern{	
	public static void main(String[] args){
		int i=1,n=4;
		while(i<=n){
			int j=1;
			//int startingNumber = i;
			while(j<=i){
				System.out.print(j);
				//startingNumber = startingNumber + 1;  
                j++;				
			}
			System.out.println();
			i++;
		}
	}
}

//It is not solved..