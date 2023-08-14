import java.util.Scanner;
class Practice{
	
	public static void main(String[] args){

			Scanner scan = new Scanner(System.in);
			int length = scan.nextInt();
			int breadth = scan.nextInt();

			if(length == breadth){

				System.out.println("It is Square");
			}
			else{

				System.out.println("It is Rectangle");
			}

	}
}