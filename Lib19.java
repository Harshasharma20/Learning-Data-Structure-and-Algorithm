class Lib19{
	
	public static void printWave(int[][] arr){

		int n = arr.length; //row
		if(n==0){

			return;
		}
		int m = arr[0].length; //col

		//col
		for(int j = 0;j<m;j++){

			if(j%2==0){

				//row
				for(int i =0;i<n;i++){

					System.out.print(arr[i][j]+ " ");
				}
			}

			else{

				for(int i = n-1;i>=0;i--){

					System.out.print(arr[i][j]+ " ");
				}
			}
		}

				
	}

	public static void main(String[] args){

		int[][] arr = {{1,  2,  3,  4, },{5,  6,  7,  8, },{9, 10, 11, 12}};

		printWave(arr);
	}
}