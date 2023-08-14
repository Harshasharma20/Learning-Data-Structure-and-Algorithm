import java.util.*;
class ReversePattern{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		int i = 1;
		while(i<=n){
			int val = i;
			int j = 1;
			while(j<=i){
				System.out.print(val);
				val--;
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
/**
 * number or rows are n number of column 4
 * nth row = decreasing numbers starting from i till 1
 * number to be printed = numbers
 */