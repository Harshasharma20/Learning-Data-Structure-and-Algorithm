class ArrayPractice24{
	
	public static void sort012(int arr[]){

		//step 1 : declared the variables
		int nextZeroes = 0;
		int nextTwo = arr.length-1;
		int i = 0;

		//step 2: check the condition if arr[i]==0 then swap it
		while(i<=nextTwo){
			if(arr[i]==0){
				int temp = arr[nextZeroes];
				arr[nextZeroes] = arr[i];
				arr[i] = temp;
				i++;
				nextZeroes++;
			}
			//step 3: check the condition if arr[i]==2 then swap it
			else if(arr[i]==2){
				int temp = arr[nextTwo];
				arr[nextTwo] = arr[i];
				arr[i] = temp;
				nextTwo--;

			}
			else{
				i++;
			}
		}
	}
}