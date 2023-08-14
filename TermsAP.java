class TermsAP{	
	public static void main(String[] args){
		int n=1,x=10;
		while(n<=x){
			int ap = (3*n+2);
			if(ap%4==0){
				x++;
				n++;
			}			
			else{
				System.out.print("\t" +ap);
				n++;
			}
		}		
	}
}