class InvertedTrianglePattern{	
	public static void main(String[] args){
		int i=1,n=5;
		while(i<=n){
			int space=1 ;
			while(space<=(-1*(n-i)-2)){
				System.out.print("_");
				space = space + 1;
			}
			int j=1;
			
			while(j<=(n-i+1)){
				//System.out.print("");
				System.out.print(" *");		
				j=j+1;
				
			}

			System.out.println();
			i=i+1;			
		}
	}
}