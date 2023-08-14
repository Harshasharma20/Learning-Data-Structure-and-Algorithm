class Lib20{
	
	public static void printSpiral(int[][] arr){

		//row
		/*for(int i=0;i<=0;i++){
			for(int j=0;j<=3;j++){
				System.out.print(arr[i][j]+ " ");
			}
		}

		//col
		for(int j=3;j<=arr[0].length;j++){
				for(int i=1;i<=arr.length;i++){
					System.out.print(arr[i][j]+ " ");
				}
		}

		//row->constant
		for(int i=3;i<=3;i++){
			for(int j=2;j>=0;j--){
				System.out.print(arr[i][j]+ " ");
			}
		}

		//col
		for(int j=0;j<=0;j++){
				for(int i=3;i>=1;i--){
					System.out.print(arr[i][j]+ " ");
				}
		}

		//row
		for(int i=1;i<=1;i++){
				//col
				for(int j=1;j<=2;j++){
					System.out.print(arr[i][j]+ " ");
				}
		}

		//row
		for(int i=2;i<=2;i++){
			for(int j=2;j>=1;j--){
				System.out.print(arr[i][j]+ " ");
			}
		}*/

	int top = 0;
    int bottom = arr.length - 1;
    int left = 0;
    int right = arr[0].length - 1;

    while (top <= bottom && left <= right) {
        // Print top row from left to right
        for (int i = left; i <= right; i++) {
            System.out.print(arr[top][i] + " ");
        }
        top++;

        // Print rightmost column from top to bottom
        for (int i = top; i <= bottom; i++) {
            System.out.print(arr[i][right] + " ");
        }
        right--;

        // Print bottom row from right to left
        if (top <= bottom) { // Check if there are more rows to print
            for (int i = right; i >= left; i--) {
                System.out.print(arr[bottom][i] + " ");
            }
            bottom--;
        }

        // Print leftmost column from bottom to top
        if (left <= right) { // Check if there are more columns to print
            for (int i = bottom; i >= top; i--) {
                System.out.print(arr[i][left] + " ");
            }
            left++;
        }
    }
	}

	public static void main(String[] args){
		int[][] arr = {{1, 2, 3, 4  },{5, 6, 7, 8  },{ 9, 10, 11, 12 },{13, 14, 15, 16}};

		printSpiral(arr);
	}	
}


