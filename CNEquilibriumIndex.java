class CNEquilibriumIndex{
	
	public static int arrayEquilibriumIndex(int[] arr){  
		
		

		//int index = -1;

		for(int i=0;i<arr.length;i++){

			int leftSum = 0;
			int rightSum = 0;

			for(int j=0;j<i;j++){
				leftSum = leftSum+arr[j];
			}
			for(int j=i+1;j<arr.length;j++){
				rightSum=rightSum+arr[j];
			}
			if(leftSum==rightSum){
				return i;
			}
		}

		return -1;

		
	}

	public static void main(String[] args){

		int[] arr = {1,7,3,6,5,6};
		System.out.print(arrayEquilibriumIndex(arr));

	}
}