import java.util.*;
class ArrayPractice11{

	public static int getSum(int nums[]){

		int sum = 0;
		
		for(int array : nums){

			sum = sum + array;
		}	

		return sum;
	}

	public static void main(String[] args){

		//Taking input from user 

		Scanner scan = new Scanner(System.in);

    	System.out.println("Enter size of the Array");

		int sizeOfArray = scan.nextInt();

		int nums[] = new int[sizeOfArray];

		for(int i=0;i<nums.length;i++){

			nums[i] = scan.nextInt();
		}

		System.out.print(getSum(nums));
	
	}
	
}