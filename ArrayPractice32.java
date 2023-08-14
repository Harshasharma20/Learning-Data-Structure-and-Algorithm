import java.util.*;
class ArrayPractice32{
	
	 public static boolean check(long A[],long B[], int N)
    {

    	Arrays.sort(A);
    	Arrays.sort(B);

    	//return Arrays.equals(A,B);  

    	for(int i=0;i<N;i++){

    		if(A[i]!=B[i]){

    			return false;
    		}
    	}

    	return true;    
    }

      
    public static void main(String[] args){
    	long a[] = {2,3,5,4,1};
    	long b[] = {2,3,5,4,1};
    	int n = a.length;
    	System.out.print(check(a,b,n));
    }
}