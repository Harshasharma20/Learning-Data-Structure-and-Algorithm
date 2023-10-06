class CNEquilibriumIndex{
	
	public static int arrayEquilibriumIndex(int[] arr){  
		
		//int index = -1;
		//Iterate all over the array elements.
		/*for(int i=0;i<arr.length;i++){

			int leftSum = 0;
			int rightSum = 0;

			//Iterate j till ith value to find the left sum
			for(int j=0;j<i;j++){
				leftSum = leftSum+arr[j];
			}

			// Iterate j = i+1 elements till n elements to find the right sum
			for(int j=i+1;j<arr.length;j++){
				rightSum=rightSum+arr[j];
			}
			//Compare leftSum and rightSum 
			if(leftSum==rightSum){
				return i;
			}
		}

		return -1;*/

		//Optimze solution
		int totalSum = 0,sum = 0;
		for(int i=0;i<arr.length;i++){

			totalSum = totalSum + arr[i];

		}

		for(int i=0;i<arr.length;i++){
			int rightSum = totalSum - sum -arr[i];
			if(rightSum==sum) return i+1;
			sum = sum + arr[i];
		}

		return -1;
	}

	public static void main(String[] args){

		int[] arr = {1,7,3,6,5,6};
		System.out.print(arrayEquilibriumIndex(arr));

	}
}