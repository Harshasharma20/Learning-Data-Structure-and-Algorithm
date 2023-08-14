class CodingNinjasNonDecreasingArray{
	
	public static boolean isPossible(int[] arr, int n) {
		/*
		boolean result = false;
		int falseCount = 0;
		int trueCount = 0;

		for(int i=0;i<arr.length-1;i++){

			
				if(arr[i]<=arr[i+1]){

					result = true;
					trueCount=trueCount+1;
					
					
				}

				else if(arr[i]>=arr[i+1]){

					falseCount = falseCount+1;
					//System.out.print(falseCount);

				}

		}

		if(falseCount == 1 && falseCount == 0){ // I change operator || to &&
			result = true;
		}	

		else if(falseCount == 1 && trueCount ==8){

			result = false;
		}	
  
		else if(falseCount>=2){


			result = false;
		
	}

	

		
		return result; */

		int modified = 0;
		for(int i=1;i<arr.length;i++){

			if(arr[i-1]>=arr[i]){

				modified++;

				if(modified>1){

					return false;
				}

				if(i<2 || arr[i-2]<=arr[i]){

					arr[i-1] = arr[i];
				}
			}
			else{

				arr[i] = arr[i-1];
			}
		}

		return true;
	}

	public static void main(String[] args){

		int[] arr = {8,4,6};
		int n = arr.length;

		System.out.print(isPossible(arr,n));

	}
}

//-71 -46 -41 -8 7 35 219 -150 57 59//f- incorrect 1

//-88, -77, -57, -54, -41, 2 ,212, -157, 34, 68//f- incorrect 2

//-78 -68 -51 -20 187 -182 42 64 66 93//f - incorrect