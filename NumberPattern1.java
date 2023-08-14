class NumberPattern1{	
	public static void main(String[] args){
		int i=1,n=4;
		while(i<=n){  
			int space=1 ;
			while(space<=2*(n-i)){
				System.out.print("_ ");
				space = space + 1;
			}
			int j=1;
			int startingNumber = i;
			while(j<=i){				
				System.out.print(startingNumber);
				startingNumber = startingNumber +1;				
				j=j+1;
			}			
			System.out.println();
			i=i+1;			
		}
    }
}