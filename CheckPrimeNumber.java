import java.util.*;
class CheckPrimeNumber{
    public static boolean isPrimeOrNot(int a){
      if(a==1 || a==0)
       return false;  
      for(int i=2;i<a;i++){
      	if(a%i==0){
      	 return false;
      	}
      }
      return true;     
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number!!");
        int input = scan.nextInt();
        if(isPrimeOrNot(input)){
         	System.out.println("Yes");
        }
        else{
         	System.out.println("No");
        }
    }
}

