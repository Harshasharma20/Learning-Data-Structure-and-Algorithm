import java.util.*;
class Lib14{
	
	public static int secondLargestElement(int arr[]){

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		int i = 0, n = arr.length;
		while(i<n){

			if(arr[i] > largest){

				secondLargest = largest;
				largest = arr[i];
			}
			
			else if (arr[i] > secondLargest && arr[i] != largest) {

            secondLargest = arr[i];
        }

        

			i++;
		}

		if (secondLargest == Integer.MIN_VALUE) {

        	secondLargest = -1;
    	
    	}
		return secondLargest;
	}

	public static void main(String[] args){

		int[] arr= {10,10,10,10};

		System.out.println(secondLargestElement(arr));
	}
}