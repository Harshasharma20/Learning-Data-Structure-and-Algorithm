class ReverseNumber{

	public static int reverseNumber(int n){
		int reverse = 0,rem;
		while(n>0){
			rem = n%10;
			reverse = (reverse*10)+rem;
			n=n/10;
		}
		return reverse;
	}	
	public static void main(String[] args){
		System.out.println(reverseNumber(10400));		
	}
}