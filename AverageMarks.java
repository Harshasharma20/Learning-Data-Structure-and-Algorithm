import java.util.*;
class AverageMarks{
		
	public static void main(String[] args){
	  int avgMarks = 0;

      //Take input from the user
	  Scanner scan = new Scanner(System.in);

	  //String input 
	  String str = scan.nextLine();

	  //Take char by string
	  char name = str.charAt(1);

	  //Take marks in integer format
	  int marks1 = scan.nextInt();
	  int marks2 = scan.nextInt();
	  int marks3 = scan.nextInt();

	  //calculate the average of marks
	  avgMarks = (marks1 + marks2 + marks3)/3;
	  
	  //print the name & avg marks
	  System.out.println(name);
	  System.out.println(avgMarks);
	  
	}
}