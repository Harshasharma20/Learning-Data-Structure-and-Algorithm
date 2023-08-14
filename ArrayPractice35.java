import java.util.*;
class ArrayPractice35{
	
	public static int solution(int a[]) {
        // Implement your solution here

        Arrays.sort(a);
        int i=0,j=i+1,n=a.length,temp=0;
        while(i<n){
            while(j<n){
               // int i = 0;
            if(a[i]<a[j] && a[j]-a[i]==2 || a[i]>0){

                temp = n-1;
            }

            else if(n%2==0){

                temp = n;
            }

            /*else{

                temp = n;
            }*/
            j++;
        } 
              
        i++;       
    }

    return temp;
       
    }

    public static void main(String[] args){

    	int a[] = {1,2,3};
    	System.out.println(solution(a));

    }
}