class TestInterview{
	
	public static int arrayDuplicateElement(int arr[]){

		int result = 0 ;

		for(int i=0;i<arr.length;i++){

			for(int j=i+1;j<arr.length;j++){

			if(arr[i] == arr[j]){

				 result = arr[j];

				// break;
			}
		}
	}
		return result;

	}

	public static void main(String args[]){

		int[] arr = {0, 3, 1, 5, 4, 3, 2};

		System.out.print(arrayDuplicateElement(arr));


	}
}