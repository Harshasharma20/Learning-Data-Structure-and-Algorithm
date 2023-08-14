class  TriangleOfNumbers{
	
	public static void main(String[] args){

			int i=4,n=4;

			while(i<=n){

				int spaces = 1;
				while(spaces<=2*(n-i)){

					System.out.print(" ");
					spaces = spaces + 1;
				}

				int j=1;
				//int val=1;
				while(j>=i){

					System.out.print(j);
				//	val = val +1;
					j--;
				}
				System.out.println();
				i--;
			}
	}
}