class ArrayPractice10{
	
	public static int removeElement(int[] nums, int val) {
        	
        	int i=0;
        	for(int j=1;j<nums.length;j++)
        	   if(nums[i] != nums[j]){
        		nums[i] = nums[j];
        		i++;
        	}
        		return i;       	
    }

    public static void main(String[] args){

    	int nums[] = {3,3,2,3};
    	int val = 3;

    	System.out.println(removeElement(nums,val)); 
    }




}