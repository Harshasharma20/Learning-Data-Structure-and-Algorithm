import java.util.*;
class FirstNegativeInteger{
	
	 public static long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        long[] result = new long[N - K + 1];
        Deque<Long> deque = new LinkedList<>();  
        
        int i=0,j=0;
        
        while(j<N){
            if(A[j]<0){
                deque.offerFirst(A[j]); //The offerFirst() method adds an element to the end of the deque.
            }
            if(j-i+1==K){
                //window check kara and negative element fill kara
                if(!deque.isEmpty()){
                     result[i] = deque.peekLast(); //The peakLast() method returns the last element of the deque without removing it.
                }
                else{
                     result[i] = 0;
                }
                //window shift krni hai but before that we'll check i pe jo number hai voh
                //less than 0 hai agar 0 se chhota hai toh element remove kr denge 
                if(A[i]<0){
                    deque.pollLast(); //The pollLast() method removes and returns the last element of the deque.
                }
                i++;
                
                
            }
            j++;
            
        }
        
        return result;
    }

	public static void main(String[] args){

		long arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
		int n = arr.length;
		int k=3;

		System.out.print(Arrays.toString(printFirstNegativeInteger(arr,n,k)));


	}
}