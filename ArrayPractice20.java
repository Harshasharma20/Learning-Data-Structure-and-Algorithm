import java.util.*;
class ArrayPractice20{
	
	public static void main(String[] args){
		int numbers[] = {0, 3, 1, 5, 4, 3, 2};
		for(int i=1;i<numbers.length;i++){
			for(int j=i+1;j<numbers.length;j++){
				if(numbers[i]==numbers[j]){
					System.out.println(numbers[i]);
				}
			}
		}		
	}
}