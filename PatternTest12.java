class PatternTest12{
	public static void main(String[] args){
		int n=5;
		int i=1;
		while(i<=n){
			int spaces=1;
			while(spaces<=i-1){
				System.out.print(" ");
				spaces++;
			}
			int j=1;
			while(j<=n){
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}

/*
*****
 *****
  *****
   *****
    *****

*/