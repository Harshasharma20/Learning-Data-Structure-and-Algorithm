import java.util.Scanner;
class Practice2{
	
	public static void main(String[] args){

			Scanner scan = new Scanner(System.in);
			int quantity = scan.nextInt();
			
			if((quantity * 100)>1000){

				int discount =  (quantity*100*10)/100;

				System.out.println(discount);
			}
			else{

				System.out.println("No discount");
			}

			

	}
}