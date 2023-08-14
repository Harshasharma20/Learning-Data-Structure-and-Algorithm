class AlphaPattern{	
	public static void main(String[] args){
		int i=1,n=3;
		while(i<=n){
			int j=1;
			while(j<=i){
				System.out.print((char)('A'+i-1));
				j++;
			}
			System.out.println();
			i++;
		}
	}
}