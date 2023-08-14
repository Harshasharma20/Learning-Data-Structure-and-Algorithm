import java.util.Scanner;
class Practice3{
	
	public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			int salary = scan.nextInt();
			int services = scan.nextInt();
			if(services>5){
				int bonus = (salary*5)/100;
				System.out.println(bonus);
			}
			else{

				System.out.println("Bonus is not applied");
			}		
	}
}