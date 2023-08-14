import java.util.*;
class Lib5{
	
	public static void findUnique(int[] arr, int n){

		int i = 0;

		Map map = new HashMap<>();
		for(i=0;i<n;i++){
			if(map.containsKey(arr[i])){
				map.remove(arr[i]);
			}
			else{
				map.put(arr[i],arr[i]);
			}

		}

		Iterator itr = map.keySet().iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}



	public static void main(String[] args){

		int arr[] = {2,3,1,6,3,6,2};
		int n = arr.length;
		findUnique(arr,n);
		
		


		
	}
}