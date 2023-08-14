import java.util.*;
class ArrayPractice22{
	
	public static void sortZeroesAndOne(int numbers[]){

		int i=0;
		int j=numbers.length-1;
		while(i<j){
			while(numbers[i]%2==0 && (i<j)){
				i++;
			}
			while(numbers[j]%2==1 && (i<j)){
				j--;
			}
			if(i<j){
				int temp=numbers[j];
				numbers[j]=numbers[i];
				numbers[i]=temp;
				i++;
				j--;
			}
		}

		System.out.println(Arrays.toString(numbers));
	}
v[]
	public static void main(String[] args){

		int numbers[] = {0, 1, 1, 0, 1, 0, 1};
	    sortZeroesAndOne(numbers);
	}
}