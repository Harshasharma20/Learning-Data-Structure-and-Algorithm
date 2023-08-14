class NumberPattern{
	
	public static void main(String[] args){

       int i=1,n=4,val=1;
       while(i<=n){
       		int j=1;
       		while(j<=i){
       			System.out.print(val); 
       			val = val + 1;
       			j = j + 1;    			      			
       		}
       		System.out.println();
       		i = i + 1;
       }
	}
}