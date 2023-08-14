class PatternTest15{
	public static void main(String[] args){
		int n=5;
		int i=1;
		while(i<=n){
			int j=1;
			while(j<=2*i-1){
				if(j==1 || j==2*i-1 || i==n){
				System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
				j++;
			}
			System.out.println();
			i++;
		}
	}
}