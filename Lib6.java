import java.util.*;
class Lib6{
	
	public static int findDuplicates(int[] arr){

		int i = 0, res = 0;
		Set set = new HashSet();

		for(i=0;i<arr.length;i++){

			if(!set.contains(arr[i])){
				set.add(arr[i]);
			}

			else if(set.contains(arr[i])){

				res = arr[i];
			}
		}

		return res;
	}

	public static void main(String[] args){

		int arr[] = {0, 3, 1, 5, 4, 3, 2};

		System.out.println(findDuplicates(arr));

	}
} 