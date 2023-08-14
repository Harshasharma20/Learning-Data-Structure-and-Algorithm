class PatternTest8{
	public static void main(String[] args){
		int n=4;
		int i=1;
		while(i<=n){			
			int spaces=n;
			while(spaces>=i){
				System.out.print(" ");
				spaces--;
			}
			int j=1;			
			while(j<=i){
			 	System.out.print(" *");
				j++;					
			}
			System.out.println();
			i++;
		}
	}
}