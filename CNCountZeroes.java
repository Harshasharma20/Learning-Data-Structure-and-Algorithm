class CNCountZeroes{
	
	public static int countZeroes(int input){
		//base case
		if(input == 0){
			return 0;
		}

		if(input<10){
			return 0;
		}

		//small calculation with recurion call
		if(input%10 == 0){

			return 1 + countZeroes(input/10);
		}

		//recursive call
		return countZeroes(input/10);


	}

	public static void main(String[] args){

		System.out.print(countZeroes(10204));
	}
}