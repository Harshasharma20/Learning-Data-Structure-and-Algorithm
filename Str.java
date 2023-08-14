import java.util.*;
class String{
	
	public static void main(String[] args){

	Scanner s = new Scanner(System.in);
    String str;        
    str = s.next();    // incompatible types: java.lang.String cannot be converted to String
                        //str = s.next();
    System.out.print(str);
	}
}