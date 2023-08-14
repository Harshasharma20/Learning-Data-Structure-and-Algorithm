import java.util.*;
class ArrayPractice16{
	
	public static int[] plusOne(int nums[]){

		for(int i=nums.length-1;i>=0;i--){
			if(nums[i] < 9){
				nums[i]++;
				return nums;
			}
			else{
				nums[i]=0;
			}
		}

		int[] newArray = new int[nums.length+1];
		newArray[0] = 1;
		return newArray;

	} 

	public static void main(String[] args){

		int nums[] = {1,2,3};
		System.out.println(Arrays.toString(plusOne(nums)));
	}
}