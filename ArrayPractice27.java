class ArrayPractice27{
	
	public static int checkRotateArray(int nums[]){

		for(int i=0;i<=nums.length;i++){
			if(nums[i]>nums[i+1]){
				return i+1;
			}
		}
		return 0;
	}
	public static void main(String[] args){

		int nums[] = {5,6,1,2,3,4};
		System.out.println(checkRotateArray(nums));
	}
}