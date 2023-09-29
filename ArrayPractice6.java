import java.util.*;
class ArrayPractice6{
	
	public static int removeDuplicates(int[] nums){
    
        int x=1;
        
        for(int y=x; y < nums.length; y++)
        {
            if(nums[y] > nums[x-1])
            {

                nums[x]=nums[y];
                x++;

            }
        }
        return x;
    }

	

	public static void main(String[] args){

		int nums[] = {1,1,2,3};
		System.out.println(removeDuplicates(nums));
	}
}