class PatternTest14{
	public static void main(String[] args){
		int n=4;
		int i=1;
		while(i<=n){
			int j=1;
			while(j<=i){
				System.out.print("*");
				j++;

			}
			System.out.println();
			i++;
		}
		//Reverse of Triangle
		i=n-1;
		while(i>=1){
			int j=1;
			while(j<=i){
				System.out.print("*");
				j++;

			}
			System.out.println();
			i--;
		}
	}
}