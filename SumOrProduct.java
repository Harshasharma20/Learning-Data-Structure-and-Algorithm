import java.util.Scanner;
class SumOrProduct{	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int choice = scan.nextInt();
		if(choice< 1 || choice > 2){
			System.out.println(-1);
		}
		else{
			int result = choice==1 ? 0 : 1;
			int i=1;
			while(i<=number){
				result = choice==1 ? result+i : result * i;
				i++;
			}
			System.out.println(result);
		}
        //int s=1,p=2,sum=0,product=1;
		// if(choice == s){
		// 	for(int su=1;su<=number;su++){            
  //            sum = sum+su;            
		// 	}
		// 	 System.out.println(sum);
		// }
		// else if(choice == p){         	
  //         	for(int pro=1;pro<=number;pro++){
  //         		product = product*pro;         		
  //         	}
  //         	System.out.println(product);
		// }
		// else{
		// 	System.out.println(-1);
		// }
	}
}
