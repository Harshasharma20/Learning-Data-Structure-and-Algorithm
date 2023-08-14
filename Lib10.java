class Lib10{
	
	public static void sort01(int[] arr){

		int low = 0, high = arr.length -1, temp = 0;

		while(low<=high){

			if(arr[low] == 0){

				low++;
			}
			else{

				temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				high--;
			}
		}
	}
	public static void main(String[] args){

		int arr[]={0,1,1,0,1,0,1};

		sort01(arr);

		for(int res : arr){

			System.out.print(res+ " ");
		}
	}
}