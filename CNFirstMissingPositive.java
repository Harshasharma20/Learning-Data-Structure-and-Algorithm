import java.util.*;
class CNFirstMissingPositive{
	
	public static int firstMissing(int[] arr, int n) {
		
	Arrays.sort(arr);

	int counter = 1;

	for (int i=0;i<arr.length;i++ ) {
			
			if(arr[i]<=0){

				continue;//for skip the negative and zero number
			}

			else if(arr[i]>=0 && arr[i]==counter){
				counter++;
			}
			else if(arr[i]!=counter){
				return counter;
			}
	}

		
return counter;

	}

	public static void main(String[] args){

		int[] arr = {1,2,0};
		int n = arr.length;
		System.out.print(firstMissing(arr,n));

	}

 
}