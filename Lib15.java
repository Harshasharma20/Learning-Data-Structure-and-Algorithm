import java.util.Arrays;
class Lib15{
	
	public static int[] rotateArray(int[] arr,int d){

		//Step 1: create new array for storing d elements
		int[] output = new int[d];
		for(int i = 0;i<d;i++){
			output[i] = arr[i];
		}

		//Step 2: Moving elements d to arr.length
		for(int i=d;i<arr.length;i++){
			arr[i-d] = arr[i];
		}

		//Step 3: copy new array element in original array
		for(int i=0;i<d;i++){
			arr[i+arr.length-d] = output[i];
		}

		return arr;
	}

	public static void main(String[] args){

		int[] arr = {1,2,3,4};
		int d = 3;

		System.out.print(Arrays.toString(rotateArray(arr,d)));

		
	}
}