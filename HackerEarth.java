import java.util.Arrays;
class HackerEarth{
	
	/*int val = 10;

	public static void main(String[] args){

		HackerEarth obj = new HackerEarth();
		System.out.println(obj.val);
	}*/

	//To find minimum number from the list:

	public static int findMinimumNumber(int arr[], int n){

		int result = 0;
		Arrays.sort(arr);

		for(int i=0;i<arr.length;i++){

			if(arr[i]<0){
				result = arr[0];
			}

			else{

				result = arr[0];
			}
		}
		return result;	
	}

	public static void main(String[] args){

		int[] arr = {(int) Math.round(10),(int) Math.round(5.3),(int) Math.round(6.6),(int) Math.round(4.2)};
		int n = arr.length-1;
		System.out.print(findMinimumNumber(arr,n));
	}
}