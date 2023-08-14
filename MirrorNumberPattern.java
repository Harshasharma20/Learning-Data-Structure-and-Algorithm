class MirrorNumberPattern{	
	public static void main(String[] args){
		int i=1,n=4;
		while(i<=n){
			int space =1;
			while(space<=(2*n-i)-i){
				System.out.print(" ");
				space = space + 1;
			}
			int j=1;
			while(j<=i){
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}