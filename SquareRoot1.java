import java.util.Scanner;
class SquareRoot1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int input = scan.nextInt();
		int i=1;
		int n=10; 
		while(i<=n){
			if(input/i==i){
				System.out.print(i);
			}
			i++;
		}	   
	}
}
