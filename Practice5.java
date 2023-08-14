import java.util.Scanner;
class Practice5{
	
	public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			int p1 = scan.nextInt();
			int p2 = scan.nextInt();
			int p3 = scan.nextInt();

			if(p1>p2 && p2<p1){

				System.out.println(" p1 is oldest");
			}
			else if(p1<p2 && p1>p2){

				System.out.println("p2 is oldest");
			}
			else{

				System.out.println("p3 is oldest");
			}
					
	}
}