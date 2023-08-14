class PatternTest3{	
	public static void main(String[] rgs){
		int n=4;  //for rows
		int i=1;
		
		while(i<=n){
			int j=1;		
			while(j<=i){				
				System.out.print(j);			    
				j++;	
			}
			int j1=i-1;
			while(j1>=1){
				System.out.print(j1);
				j1--;
			}
			System.out.println();
			i++;
		}
    }
}


/*

This Program will print:



1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1



*/