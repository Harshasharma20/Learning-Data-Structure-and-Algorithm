class Lib11{
	
	public static void pushZeroes(int[] arr){

		int i = 0, low = 0, n = arr.length-1, temp = 0;
		for(i=0;i<n;i++){

			if(arr[i]!=0){

				temp = arr[i];
				arr[i] = arr[low];
				arr[low] = temp;
				low++;
			}
		}
	}
	public static void main(String[] args){

		int arr[] = { 0, 3, 0, 2, 0};

		pushZeroes(arr);

		for(int res : arr){

			System.out.print(res+ " ");
		}

	}
}