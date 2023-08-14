import java.util.Scanner;
import java.lang.Character;
class CharacterCase{

		public static int caseCharacter(char ch){
			if(Character.isUpperCase(ch)){
				return 1;
			}
			else if(Character.isLowerCase(ch)){
				return 0;
			}
			else {
				return -1;
			}		
		}
	public static void main(String[] args){
	  	Scanner scan = new Scanner(System.in);
	  	String str = scan.next();
	  	char ch = str.charAt(0);
	  	System.out.println(caseCharacter(ch));


	}
}
