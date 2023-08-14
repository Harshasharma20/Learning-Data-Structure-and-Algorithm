class PatternTest4{
	public static void main(String[] agrs){
		int n=4;
		int i=1;
		while(i<=n){
			int spaces=1;
			while(spaces<=i-1){
				System.out.print(" ");
				spaces++;
			}
			int j=1;
			int val=i;
			while(j<=n-i+1){
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

1 2 3 4
  2 3 4
    3 4
      4

*/