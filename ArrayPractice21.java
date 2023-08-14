class ArrayPractice21{
	
	public static int tripletSum(int numbers[], int target){

		int count=0;
		for(int i=0;i<numbers.length;i++){
			for(int j=i+1;j<numbers.length;j++){
				for(int k=j+1;k<numbers.length;k++){
					if(numbers[i]+numbers[j]+numbers[k]==target){
						count++;
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args){

		int numbers[]= { 1, 2, 3, 4, 5, 6, 7 };
		int target = 19;

		System.out.println(tripletSum(numbers,target));

	}
}