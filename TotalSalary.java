import java.util.Scanner;
import java.lang.Math;
class TotalSalary{
	
	public static void main(String[] args){

    double totalSalary = 0.0;
	float hra = 0,da = 0,pf = 0;
	int allow = 0;
     
    Scanner scan = new Scanner(System.in);
    int basicSalary = scan.nextInt();
    String str = scan.next();
    char grade = Character.toUpperCase(str.charAt(0));
    System.out.println(grade);

    hra = (basicSalary * 20)/100f;
    da =  (basicSalary * 50)/100f;
    pf =  (basicSalary * 11)/100f;
    System.out.println(hra+  " : " +da+ " : " +pf);

    // if(grade == 'A'){
    //  	allow = 1700;
    //  }
    //  else if(grade == 'B'){
    //  	allow = 1500;
    //  }
    //  else if((grade == 'C') || (grade!= 'A') || (grade!= 'B')){
    //  	allow = 1300;
    //  }
    //  else{
    //  	System.out.println("Not Valid");
    //  }

    switch(grade){

    case 'A':

    	allow = 1700;
    	break;
    
    case 'B':

    	allow = 1500;
    	break;

    case 'C':
        
        allow = 1300;
        break;

    default:

        allow = 1300;
        break;    	
    
    }
     totalSalary = basicSalary + hra + da + allow - pf;
     System.out.println(Math.round(totalSalary));
	}
}