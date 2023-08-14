import java.util.*;
class ArrayPractice31{
	
	public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        n = arr.length;
        ArrayList<Integer> newArrayList = new ArrayList<Integer>();
        for(int element : arr){
            if(!newArrayList.contains(element)){
                newArrayList.add(element);
            }
        }
        return newArrayList;       
    }

    public static void main(String[] args){

    	int arr[] = {10,20,10,30,20};
        int n = arr.length;
    	System.out.println(duplicates(arr,n));
    }
}