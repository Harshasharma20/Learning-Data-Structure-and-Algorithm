import java.util.Arrays;
class Lib17{
	
	public static int[] sum2DArray(int[][] arr, int n, int m){

		int[] sumArray = new int[n];

    	// Calculate and print the sum of each row

    	System.out.println("\nSum of each row:");

    	for (int i = 0; i < n; i++) { 

    	int rowSum = 0;      

        for (int j = 0; j < m; j++) {

            rowSum += arr[i][j];
        }

        sumArray[i] = rowSum;

       System.out.print(rowSum+ " ");
    }

    return sumArray;
	
	}

	public static void main(String[] args){

		int n = 4;
		int m = 2;

		int[][] arr = new int[n][m];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[1][0] = 3;
		arr[1][1] = 4;
		arr[2][0] = 5;
		arr[2][1] = 6;
		arr[3][0] = 7;
		arr[3][1] = 8;

		
		sum2DArray(arr,n,m);

		
	}
}