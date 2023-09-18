class CNInPlaceRotate90Degree{
	
	public static void inplaceRotate(int[][] arr, int n) {
		// Write your code here.

		int temp = 0;
		for(int i=0;i<n;i++){
			for(int j=0;j<i;j++){

				temp = arr[i][j];
				arr[i][j]= arr[j][i];
				arr[j][i]=temp;
			}

		}

		//for swap ist row to 3rd row
		for(int i=0;i<=n/2;i++){
			for(int j=0;j<=n;j++){
				
				temp = arr[n-i-1][j];
				arr[n-i-1][j] = arr[i][j];
				arr[i][j] = temp;
			}
		}
	}

	public static void main(String[] args){

		int[][] arr = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};

		int n = arr.length;
		inplaceRotate(arr,n);

	}
}