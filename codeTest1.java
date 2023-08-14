import java.util.*;
class codeTest1{	
	/*public static int GCD(int a, int b){
		if(a==0)
			return b;
		return GCD(b%a,a);
	}
	public static void main(String[] args){
		int a = 14, b = 12, g;
		g = GCD(a,b);
		System.out.println(g);
	}*/

	// Check Prime Number:

	/*public static boolean isPrime(int n){
		if(n==0 || n==1)
			return false;
		for(int i=2;i<n;i++){
			if(n%i==0)
				return false;			
		}		
        return true;
	}
	public static void main(String[] args){
		for(int a=1;a<=10;a++){
			if(isPrime(a))
			System.out.println(a);
		}
	}*/

	//Find Power

	/*public static void main(String[] args){
		int power = 1;
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int n = scan.nextInt();
		for(int i=1;i<=n;i++){
			power = power * x;
		}
		System.out.println(power);
	}*/

	// Print star Pattern

	/*public static void main(String[] args){
	int i=1,n=3;
	while(i<=n){
		int space = 1;
		while(space<=n-i){
			System.out.print(" ");
			space++;
		}
		int j=1;
		while(j<=2*i-1){
			System.out.print("*");
			j++;
		}
		System.out.println();
		i++;
	}
   }*/

   // Print Number Pattern

   public static void main(String[] args){

   int i=1,n=4;

   while(i<=n){

   	int j=1, val=4;

   	while(j<=i){

   		while(val<=i){

   			System.out.print(val);
   			val--;

   		}

   		//System.out.print(j);
   		j++;
   	}

   	System.out.println();
   	i++;
   }
}
}