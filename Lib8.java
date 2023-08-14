class Lib8{
	
	public static int pairCount(int[] arr){

	 int count = 0;

		for(int i=0;i<arr.length;i++){

			for(int j=i+1;j<arr.length;j++){
				int sum = 7;
				if(arr[i] + arr[j] == sum){

					count++;
				}
			}
		}

		return count;
	}

	public static void main(String[] args){

		int arr[] = {2, 8, 10, 5, -2, 5};

		System.out.println(pairCount(arr));
	}

}