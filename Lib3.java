import java.util.Arrays;
class Lib3{
	
	public static int[] arrangeNumbers(int arr[],int n){
		
 		int i = 1, left = 0, right = arr.length-1;
 		while(i<=n){

 			if(i%2!=0){

 				arr[left] = i;
 				left++;
 			}
 			else{

 				arr[right] = i;
 				right--;
 			}

 			i++;

 		}

 		return arr;

	}
	public static void main(String[] args){
		int n = 9;
		int[] arr = new int[n];
		
		System.out.println(Arrays.toString(arrangeNumbers(arr,n)));
	}
}