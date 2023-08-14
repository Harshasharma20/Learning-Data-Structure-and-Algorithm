class PatternTest1{	
	public static void main(String[] rgs){
		int n=4;  //for rows
		int i=1; 
		while(i<=n){
			int j=1;
			int val=n-i+1;
			while(j<=n+1-i){
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

4 3 2 1
3 2 1
2 1
1

*/