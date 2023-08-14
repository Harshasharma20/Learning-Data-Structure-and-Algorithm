import java.util.*;
class ArrayPractice19{
	
	public static int[] uniqueElement(int numbers[]){
int numbers1[] = new int[2];
		int res1 = numbers[0],res2 = numbers[1];;

		for(int i=2;i<numbers.length;i++){
			numbers1[0] = res1 ^ numbers[2];
			numbers1[1] =res2^ numbers[2];

		}

		return numbers1;
	}

	public static void main(String[] args){
		int numbers[] = {5,4,1,4,3,5,1,2};
		System.out.println(Arrays.toString(uniqueElement(numbers)));
	}
}