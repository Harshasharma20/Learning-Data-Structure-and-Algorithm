class InterestingAlpha{
		public static void main(String[] args){
		int i=1,n=8;
		while(i<=n){
			int j=1;
			char startingChar = 'H';
			while(j<=i){            
             System.out.print((char)(startingChar - i + 1));
             startingChar = (char)(startingChar + 1);
             j++;
			}
			System.out.println();
			i++;
		}
	}
}