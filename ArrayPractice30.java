class ArrayPractice30{
	
	public static int sum(int a, int b){

	int carry = b,sum=0;

		//I'll run until my carry is not equal to zero
		while(carry!=0){
			//This bitwise xor operation calculates the sum without carry.

			sum =  a^b;
			//This left shift operation shifts the carry to the left by one position.
			carry = (a&b)<<1;

			//I'll update a and b
			a=sum;
			b=carry;
		}
		return sum;
	}

	public static void main(String[] args){
		int a =5, b=6;
		System.out.println(sum(a,b));
	}
}