import java.util.*;
class Fib{	
	public static int fibMemExist(int n){

		if(n){

		if(n<=1){

			return n;
		}

		return fibMemExist(n-1) + fibMemExist(n-2);
		
	}
}
	public static void main(String[] args){

		int n = 12;

		System.out.println(fibMemExist(n));
		

	}
}