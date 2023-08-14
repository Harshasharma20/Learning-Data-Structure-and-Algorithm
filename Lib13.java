class Lib13{
	
	public static void sort012(int[] arr){

		int i = 0; 
		int nextZero = 0, nextTwo = arr.length-1;

		while(i<=nextTwo){

			if(arr[i] == 0){
				int temp = arr[i];
				arr[i] = arr[nextZero];
				arr[nextZero] = temp;
				nextZero++;
				i++;
			}

			else if(arr[i] == 2){
				int temp = arr[i];
				arr[i] = arr[nextTwo];
				arr[nextTwo] = temp;
				nextTwo--;

			}

			else{

				i++;

			}			
			
		}
	}

	public static void main(String[] args){

		int[] arr={0, 1, 2, 0, 1, 2, 0};

		sort012(arr);

		for(int res : arr){

			System.out.print(res+ " ");
		}
	}
}