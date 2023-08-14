import java.util.*;
class ArrayPractice26{
	
	public static void rotateArray(int nums[], int d){
		//create new array for d
	int[] temp = new int[d];
	for(int i=0;i<d;i++){
		temp[i]=nums[i];
	}
	//moving d to n
	for(int i=d;i<nums.length;i++){
		nums[i-d]=nums[i];
	}
	//copy new array element in original array
	for(int i=0;i<d;i++){
		nums[i+nums.length-d]=temp[i];
	}

	}
	public static void main(String[] args){
		int nums[] = {1,2,3,4};
		int d = 2;

		
			rotateArray(nums,d);

	
	}
}