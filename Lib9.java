class Lib9{
	
	public static int tripletSum(int[] arr){

		int count = 0;

		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				for(int k=j+1;k<arr.length;k++){
					int sum = 10;
					if(arr[i]+arr[j]+arr[k] == sum){

						count++;
					}
				}
			}
		}

		return count;
	}

	public static void main(String[] args){

		int[] arr = {2, -5, 8, -6, 0, 5, 10, 11, -3};
		System.out.print(tripletSum(arr));
	}
}