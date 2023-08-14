class Lib1{
	
	public static int returnSum(int[] arr, int n){

		int i=0,sum=0;

		while(i<n){

			sum = arr[i] + sum;

			i++;
		}

		return sum;
	}

	public static void main(String[] args){

		int[] arr = {10, 20, 30 };
		int n = 3;
		System.out.println(returnSum(arr,n));
	}
}