class PatternTest2{	
	public static void main(String[] rgs){
		int n=4;  //for rows
		int i=1; 
		while(i<=n){
			int j=1;
			int val=i;
			while(j<=i){
				System.out.print(val);
				val--;
				j++;
			}
			System.out.println();
			i++;
		}  
	}
}

/*

This Program will print:

1
2 1
3 2 1
4 3 2 1

*/