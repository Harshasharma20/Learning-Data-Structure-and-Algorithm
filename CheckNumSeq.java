import java.util.*;
class CheckNumSeq{	
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int curr=0; 
	int prev=0;
	int inc =0;
	for(int i =0; i<n; i++){
		curr = sc.nextInt();		
		if(curr==prev){
			System.out.println("false");
			return;
		}		
		else if(curr<prev){
			if(inc>0){
				System.out.println("false");
				return;
			}
		}
		else if(curr>prev && i>0){
			inc++;
		}
		prev=curr;
	}	
	System.out.println("true");
}
}

/*
This is not done
*/