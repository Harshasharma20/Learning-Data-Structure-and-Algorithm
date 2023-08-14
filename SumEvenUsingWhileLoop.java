import java.util.Scanner;
class SumEven{	
	public static void main(String[] args){
		int i = 1, n = 6, sum = 0;
		while(i<=n){
			if(i%2==0){
				sum = sum+i;				
			}			
			i++;
		}
		System.out.println(sum);
	}
}
/