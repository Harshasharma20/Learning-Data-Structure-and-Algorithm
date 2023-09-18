class CNSumDigits{
	
	public static int sumNum(int n){

		
		if(n==0){

			return 0;
		}

		int sum = n%10; 
		
			int ans = sumNum(n/10);

			return ans + sum;

	}
	public static void main(String[] args){

		System.out.print(sumNum(12345));
	}
}