class ArrayPractice5{
	
	public static int[] twoSum(int[] nums, int target) {
		
		int[] indicies = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    indicies[0]=i;
                    indicies[1]=j;
                }
            }
        }
        return indicies;
		        
    }

    public static void main(String[] args){

    	int[] nums = new int[4];
    	nums[0]=2;
    	nums[1]=7;
    	nums[2]=11;
    	nums[3]=5;
    	int target = 9;
    	for(int x : twoSum(nums, target))
    	System.out.print( x  + "");
    	

    }

}