class PatternTest{
	public static void main(String[] args){
		/*int i=1,n=4;
		while(i<=n){
			int j=n;
			while(j>=i){
				System.out.print(j+ " ");								
					j--;
			}
			System.out.println();
			i++;
		}*/

		// Another Pattern

		/*int i=1,n=4;
		while(i<=n){
			int j=n,val=1;
			while(j<=2*i+2){
				System.out.print(val);
				val++;
				j--;
			}
			System.out.println();
			i++;
		}*/

		//Another Pattern

		/*int n=4,i=n;
		while(i>=1){
			int j=1;
			while(j<=i){
				System.out.print(j+ " ");
				j++;
			}
			System.out.println();
			i--;
		}*/

		//Another Pattern
		/*int n=4,i=n;
		while(i>=1){
			int j=n;
			while(j<=i){
				System.out.print(j+ " ");
				j--;
			}
			System.out.println();
			i--;
		}*/

		/*int n=4;
		int i=0;

		while(i<=n-1){
			//we are printing ith row
			int j=0;
			int val = n;
			while(j<n-i){
				System.out.print(val);
				val--;
				j++;
			}
			System.out.println();
			i++;
		}*/

		// Another Pattern
		int n=4;
		int i=1;

		while(i<=n){
			//we are printing ith row
			int j=1;
			int val = i;
			while(j<=n+1-i){
				System.out.print(val);
				val++;
				j++;
			}
			System.out.println();
			i++;
		}
	}
}

/*

****
****
****
****
* * * *
* * *
* * 
*

4 3 2 1
3 2 1
2 1
1

1 2 3 4
2 3 4
3 4
4


4 3 2 1
4 3 2
4 3
4

1 2 3 4
1 2 3
1 2
1





*/