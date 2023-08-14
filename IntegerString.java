import java.util.*;
class IntStr{
	
	public static void main(String[] args){

	Scanner s = new Scanner(System.in);
    String str = s.next();
    //String str1 = s.next();
    int a = s.nextInt();
    System.out.print(str + " " + a);  //InputMismatchException
	}
}