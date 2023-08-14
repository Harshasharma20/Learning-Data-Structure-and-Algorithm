class Lib18{
	
	public static void largestRowAndCol(int[][] arr){

		int row_max = Integer.MIN_VALUE;
		int col_max = Integer.MIN_VALUE;
		int row = 0;
		int col = 0;

		//rowSum
		for(int i = 0;i <arr.length;i++){
			int sum = 0;
			for(int j = 0;j<arr[0].length;j++){]
			

				sum+=arr[i][j];
			}

			if(sum>row_max){

				row_max=sum;
				row = i;
			}

		}

		//colSum
		if(arr.length>0){
		for(int i = 0;i < arr[0].length;i++){

			int sum = 0;

			for(int j = 0;j<arr.length;j++){

				sum+= arr[j][i];
			}

			if(sum>col_max){
				col_max=sum;
				col = i;
			}

		}
	}
		//compare rowSum and colSum elements 
		
		if(col_max>row_max){
			System.out.println("column"+" "+col+" "+col_max);
		}
		else{
			System.out.println("rows"+" "+row+" "+row_max);
		}

	}

	public static void main(String[] args){

		int[][] arr = {{1,2},{90,100},{3,40},{-10,200}};
	
		largestRowAndCol(arr);
	}
}