class Lib16{
	
	public static int checkArrayRotation(int[] arr){

		int result = 0;

		int i = 0,n = arr.length-1;

		while(i<n){

				if(arr[i] > arr[i+1]){

					result = i+1;

					
				}

				else if(arr[i]!=arr[i+1] && arr[i]>arr[i+1]){

					result = 0;
				
			}
			i++;
		}

		return result;		
}

	public static void main(String[] args){

		int[] arr = { 3, 6, 8, 9, 10};
		System.out.print(checkArrayRotation(arr));
	}
}