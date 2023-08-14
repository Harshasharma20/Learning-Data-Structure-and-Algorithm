import java.util.*;
class TwoSum{
	
	public static int[] twoSum(int[] nums, int target){
		int left=0,right = nums.length-1,sum;	
	  while(left<right){
	  	sum=nums[left]+nums[right];
	  	if(sum==target){
	  		return new int[]{left + 1 , right + 1};
	  	}
	  	else if(sum>target){
	  		right--;
	  	}
	  	else{
	  		left++;
	  	}
	  }
	  return new int[]{-1 , -1};
	}
	public static void main(String[] args){
		int[] nums = new int[5];
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		nums[3]=5;
		nums[4]=8;
		int target=7;
		
		for(int x : twoSum(nums , target))
            System.out.print(x + " ");
	}
}