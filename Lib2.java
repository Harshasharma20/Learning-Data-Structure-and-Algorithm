class Lib2{
	
	public static int linearSearch(int[] arr, int n){

		int i = 0, key = 9, index = 0;

		while(i<n){

			if(arr[i]==key){

				index = i;

				break;
			}

			else{

				index = -1;
			}

			i++;

		}
		return index;
	}
		

	public static void main(String[] args){

		int arr[] = {2, 13, 4, 1, 3, 6, 28};
		int n = 7;
		System.out.println(linearSearch(arr,n));
	}
}