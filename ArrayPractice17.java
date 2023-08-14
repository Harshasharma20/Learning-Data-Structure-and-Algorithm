import java.util.*;
class ArrayPractice17{
	
	public static void maxSubArraySum(int numbers[]){

		int curSum = 0;
		int maxSum = Integer.MIN_VALUE;

		for(int i=0;i<numbers.length;i++){
			for(int j=i;j<numbers.length;j++){
				curSum=0;
			for(int k=i;k<=j;k++){
				curSum+=numbers[k];
			}
			System.out.print(curSum);
			if(maxSum< curSum){
				maxSum=curSum;
			}
		}
	}

		System.out.println(maxSum);
	}

	public static void main(String[] args){
		int numbers[] = {2,4,6,8,10};
		maxSubArraySum(numbers);
	}


}