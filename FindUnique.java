import java.util.*;
class FindUnique{
	
	public static void main(String[] args){

	//	int element = 0,count = 0;

		int arr[] = {2,2,3,1,6,6,4,5};

		int size = arr.length;

		//Scanner scan = new Scanner(System.in);
		//int testCase=scan.nextInt(); //For taking test cases
		//int sizeArray=scan.nextInt(); // For taking size of array**	

		/*for(int i=0;i<size;i++){
			
			sizeArray = scan.nextInt();
					  	    
	    }

	    arr = new int[sizeArray];*/

	    HashSet<Integer> hashSet = new HashSet<>();
		for(int i=0;i<size;i++){
			
              if(!hashSet.contains(arr[i])){

              	hashSet.add(arr[i]);


              }
			}
			System.out.print(hashSet);							
       }
    }
/**
 * baby let's talk here thik hai :)
 * I show you error ..which I'm getting ..it is simple ...
 * Sure Baby dhikao
 * ok baby not let me check the code
 * okay darling..
 * let me do ..darling
 * Now perfect ...I didn't apply minus 1
 * baby is it possible to make voice call I can explain you better same thing I can also explain on chat also but it would be difficult for 
 * you to ask cross questions
 * Okay darling, we can make call ..but this question I understand I'll tell you okay ..:)
 * sure baby then I'm making call
 * okay kro
 * madam ji switch aa rha hai aapka phone no.
 * nhi toh darling...switch on hai
 * whatsaap pe kiya hai baby mainey
 * ohh acha
 * mai krti hu phir
 *  ok babu kro
 * arey yrr wifi disconnect kr diya tha
 * awaj nhi aa rahi kya?
 * haan baby nahi aa rahi awaj
 * 
 */