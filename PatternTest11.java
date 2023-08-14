class PatternTest11{
	public static void main(String[] args){
		int n=5;
		int i=1;
		//for triangle
		while(i<=n){
			int spaces=1;
			while(spaces<=n-i){
			 System.out.print(" ");
			 spaces++;
			}
			int j=1;
			while(j<=2*(i-1)+1){
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		//for reverse of triangle
		i=n-1;
		while(i>=1){
			int spaces=1;
			while(spaces<=n-i){
			 System.out.print(" ");
			 spaces++;
			}
			int j=1;
			while(j<=2*(i-1)+1){
				System.out.print("*");
				j++;
			}
			System.out.println();
			i--;
		}

	}
}

/*

Diamond Pattern
*/