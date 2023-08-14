import java.util.Arrays;
class Lib4{
	
	public static void swapAlternates(int[] arr){

		int i = 0; int temp = 0;
		while(i<arr.length-1){

		 temp = arr[i];
		 arr[i] = arr[i+1];
		 arr[i+1] = temp;

		 i+=2;

		}
	}

	public static void main(String[] args){

		int[] arr = {9, 3, 6, 12, 4, 32};
		swapAlternates(arr);

		for(int a : arr){
	
		System.out.print(a+ " ");
	   }

	}
}