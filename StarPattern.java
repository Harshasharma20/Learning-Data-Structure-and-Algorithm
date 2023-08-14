class StarPattern{	
	public static void main(String[] args){
		int i=1,n=3;
		while(i<=n){
			int space=1 ;
			while(space<=2*(n-i)){
				System.out.print(" ");
				space = space + 1;
			}
			int j=1;
			while(j<=(i*2)-1){
				System.out.print("");
				System.out.print(" *");			
				j=j+1;
			}			
			System.out.println();
			i=i+1;			
		}
	}
}