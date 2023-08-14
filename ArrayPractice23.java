class ArrayPractice23{
	
	public static void sumOfTwoArrays(int arr1[],int arr2[], int output[]){

		int i = arr1.length-1;
		int j = arr2.length-1;

		int carry = 0;
		int k = Math.max(arr1.length,arr2.length);
		while(i>=0 && j>=0){
			int sum = arr1[i]+arr2[j]+carry; // 4 + 6 + 0 = 10
			output[k] = sum%10; // 10%10 = 0
			carry= sum/10; // 10/10 = 1
			i--;
			j--;
			k--;
		}
		while(i>=0){

			int sum = arr1[i]+carry;
			output[k] = sum %10;
			carry = sum/10;
			i--;
			k--;
		}
		while(i>=0){
			int sum = arr1[j]+carry;
			output[k] = sum %10;
			carry = sum/10;
			j--;
			k--;
		}
		output[0] = carry; //if carry remains or bach jaati hai toh usko 0th index pr add kr denge.

}