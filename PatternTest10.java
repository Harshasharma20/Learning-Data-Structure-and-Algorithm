class PatternTest10{
	public static void main(String[] args){
		int n=4;
		int i=1;
		while(i<=n){
			int j=1;
			int x=n;
			int val=i;			
			while(j<=i){
				System.out.print(val);				
				val=val+x;
				x--;				
				j++;
			}
			System.out.println();
			i++;
		}
	}
}