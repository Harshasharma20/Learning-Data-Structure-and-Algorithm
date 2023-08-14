class ArrayPractice28{

	public static int missingNumber(int nums[]){
	int sum = 0,n=nums.length,missingNumber=0;
	 
	 for(int i=0;i<nums.length;i++){
	 	
	 	sum = sum+nums[i];
	 //	int n = nums.length;
	 	int expectedSum = n*(n+1)/2;
	 	missingNumber = expectedSum - sum;
	 	
	 }
	 return missingNumber;
	}
	 

	public static void main(String[] args){
		int nums[] = {0,1};
		System.out.println(missingNumber(nums));
	}
	

}