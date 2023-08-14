import java.util.*;
class CodingNinjasReverseArray{
	
	public static void reverseArray(ArrayList<Integer> arr, int m){

		
		//convert Arraylist to array:
		Integer[] arr1 = new Integer[arr.size()];
		arr1=arr.toArray(arr1);

		/*
		//create temp array to store element after m:
		int[] temp = new int[arr1.length-1-m];
		int[] temp1 = new int[arr1.length-1-m];

		//store elements after m in the temp and whatever operation w need to perform we'll perform in temp
		//array:
		for(int i=m+1;i<arr1.length;i++){
			temp[i-m-1]= arr1[i];
		}

		//reverse temp array:
		for(int i=temp.length-1;i>=0;i--){
			temp1[temp.length-1-i] = temp[i];
			//temp[temp.length-1-i] = temp[i];
			//System.out.print(temp1[temp.length-1-i]);
		}

		//copy temp array in original array:
		for(int i=0;i<temp1.length;i++){
			arr1[m+i+1]= temp1[i];
		}

		for(int result: arr1){

			System.out.print(result+ " ");
		}

	}

	public static void main(String[] args){

		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);//16 17 30 18 24 30 18 22 11 16 
		arrayList.add(9);//19 11 13 26 27 26 13 11 
		arrayList.add(8);//25 18 24 28 20 22 13 28 12 
		arrayList.add(7);
		arrayList.add(6);//17 21 18 10 14 13 26 17 19 18 
		//arrayList.add(6);//27 14 25 10 19 23 29 15 15 19 
		//arrayList.add(1);//1 4 5 6 6 7 7 
		//arrayList.add(3);//10 4 5 2 3 6 1 3 6
		//arrayList.add(6);
		//arrayList.add(19);
		//arrayList.add(18);

		int m = 2;
		reverseArray(arrayList,m);  */

		int i=m+1,n=arr1.length-1;
		int j = n;
		while(i<n && j>=i){
			
			int temp = arr1[i];
			arr1[i] = arr1[j];
			arr1[j] = temp;

			j--;
			i++;
			
		}
										
		for(int result:arr1){
			System.out.print(result+ " ");
		}

		
	} 

	public static void main(String[] args){

		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(27);//16 17 30 18 24 30 18 22 11 16 
		arrayList.add(14);//19 11 13 26 27 26 13 11 
		arrayList.add(25);//25 18 24 28 20 22 13 28 12 
		arrayList.add(10);//27 14 25 10 19 23 29 15 15 19 
		arrayList.add(19);
		arrayList.add(23);
		arrayList.add(29);
		arrayList.add(15);
		arrayList.add(15);
		arrayList.add(19);



		int m=2;

		reverseArray(arrayList,m);

	}    
}



 