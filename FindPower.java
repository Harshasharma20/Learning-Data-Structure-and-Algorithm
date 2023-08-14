import java.util.Scanner;
class FindPower{
	
	public static void main(String[] args){
       
       int power = 1;

       Scanner scan = new Scanner(System.in);
       int x = scan.nextInt();
       int n = scan.nextInt();
       
       for(int i=0;i<n;i++){
          power = x*power;     
        }
    System.out.println(power); 
	}
}