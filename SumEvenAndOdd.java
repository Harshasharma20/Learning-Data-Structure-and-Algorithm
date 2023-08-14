import java.util.Scanner;
class SumEvenAndOdd{
	public static void main(String[] args){
          int even=0,odd=0,i;	
          Scanner scan = new Scanner(System.in);
          int number = scan.nextInt();
          String num = String.valueOf(number); 

          for(i=0;i<num.length();i++)
      	if(i%2==0)  {          
           odd = odd+(num.charAt(i)-'0');  
      	}
      	else{
      		even = even+ (num.charAt(i) - '0');
      	}
      
      System.out.println(even+ " " +odd);

	}
}