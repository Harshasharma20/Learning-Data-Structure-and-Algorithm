 class ArrayPractice25{

 	public static int secondLargest(int nums[]){

 		int largest = Integer.MIN_VALUE;
 		int secondLargest = Integer.MIN_VALUE;

 		for(int i=0;i<nums.length;i++){
 			if(nums[i]>largest){
 			secondLargest = largest;
 			largest = nums[i];
 		}
 		else{
 			if(nums[i]>secondLargest && nums[i]<largest){
 				secondLargest = nums[i];
 			}
 		}
 	}
 	return secondLargest;
 	}

 	public static void main(String[] args){

 		int nums[] = { 9, 3, 6, 2, 9};
 		System.out.println(secondLargest(nums));
 	}
 }