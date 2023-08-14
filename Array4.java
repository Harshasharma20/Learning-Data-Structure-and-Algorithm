import java.util.*;
class Array4{
	public static void main(String[] args){
		int[] a= {30,20,40,10};
		for(int traverse :a){
			//System.out.println(traverse);
		}
		Arrays.sort(a);
		for(int number:a){
			System.out.println(number);
		}
	}
}