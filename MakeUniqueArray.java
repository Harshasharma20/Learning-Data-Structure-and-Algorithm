import java.util.*;
class MakeUniqueArray {

	public static int minElementsToRemove(ArrayList<Integer> arr) {

		int count=0;
		int removeElement=0;
		
		//Create LinkedHashSet to contains the arraylist element\
		Set<Integer> set = new HashSet<>();

		for(int result : arr){

			if(!set.contains(result)){

			set.add(result);

			count++;
		}
	}

	removeElement = arr.size() - count;

		return removeElement ;
	}

	public static void main(String[] args){

		Integer[] array = {1, 2, 3, 1, 2};
		

		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(array));  
        System.out.print(minElementsToRemove(arr));
        
	}
}