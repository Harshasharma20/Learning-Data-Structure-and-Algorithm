class SortArray{
	
	public static void main(String[] args){

     int temp = 0,i=0;

	  int[] nums = new int[5];
	  nums[0] = 3;
	  nums[1] = 5;
	  nums[2] = 1;
	  nums[3] = 4;
	  nums[4] = 8;

	  for(i=0;i<nums.length-1;i++){

	  	for(int j=i+1;j<nums.length-1;j++){

	  	if(nums[i]>nums[j]){
           temp = nums[i];
           nums[i] = nums[j];
           nums[j] = temp;

	  	}
	  }

	  System.out.println(nums[i]);
	  
	}
}
}