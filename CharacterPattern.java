class CharacterPattern{	
	public static void main(String[] args){
	 	int i=1,n=6;	 	
	 	while(i<=n){
	 		int j=1;
	 		char startingChar='A';	
	 		while(j<=i){ 	 					
	 			System.out.print((char)(startingChar + i - 1));
	 			startingChar = (char)(startingChar + 1);
	 			j++;
	 		}
	 		System.out.println();
	 		i++;
	 	}
	}
}