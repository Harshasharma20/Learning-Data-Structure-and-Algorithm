class MergeArray{
	
	public static void main(String[] args){

		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {6,7,8,9};

		int length1 = arr1.length;
		int length2 = arr2.length;

		//To Storing output in new array
		int[] output = new int[length1+length2];	


		//copy elements from arr1 to output using a for loop
		for(int i=0;i<length1;i++){

			output[i]=arr1[i];
		}

		//copy elements from arr2 to output using for loop
		for(int i=0;i<length2;i++){
			output[length1+i] = arr2[i];
		}

		for(int i=0;i<output.length;i++){

			System.out.print(output[i]+ " ");

		}	
	}
}