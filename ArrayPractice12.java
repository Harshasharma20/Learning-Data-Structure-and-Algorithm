class ArrayPractice12{
	
	public static int searchElement(int nums[], int key){

		for(int i=0;i<nums.length;i++){

			if(nums[i] == key){

				return i;
			}
		}
		
		return -1;

	}

	public static void main(String[] args){

		int nums[] = {2, 13, 4, 1, 3, 6, 28};
		
		int key = 3;
 
 		int index = searchElement(nums,key);

		if(index == -1){
			System.out.println("NotFound");
		}
		else{
			System.out.println("Key is present at index " +index);
		}

	}
}