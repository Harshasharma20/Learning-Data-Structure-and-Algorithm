import java.util.*;
import java.util.stream.Collectors;
class LeaderOfArray{
	
	public static ArrayList<Integer> leaders(int arr[], int n){
       
       //Last element will always be leader

		ArrayList<Integer> list = new ArrayList<Integer>();
		int maxRight = arr[n-1];

		list.add(maxRight);
	
		for(int i=n-2;i>=0;i--){

			if(arr[i]>maxRight){

				maxRight = arr[i];

				list.add(maxRight);
			}			
		}

		Collections.reverse(list);
	
		return list;
    }
    public static void main(String[] args){

    	int arr[] = {16,17,4,3,5,2};
    	int n = arr.length;

    	ArrayList<Integer> output = leaders(arr,n);

    	for(int result : output){

    		System.out.print(result);
    	} 
    }
}