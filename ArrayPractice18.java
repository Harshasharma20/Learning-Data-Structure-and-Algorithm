class ArrayPractice18{
	
	public static int uniqueElement(int arr[]){

		int res = arr[0];
		for(int i=1;i<arr.length;i++){
			res = res ^ arr[i];
		}
		return res;
	}
	public static void main(String[] args){

		int arr[] = {1,2,3,3,6,1,6};
		System.out.println(uniqueElement(arr));
	}

}