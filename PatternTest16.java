class PatternTest16{
	public static void main(String[] args){
		int n=4;
		int i=1;
		while(i<=n){
			int j=1;
			while(j<=n){
				if(j==1 || j==n || i==n || i==1){
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