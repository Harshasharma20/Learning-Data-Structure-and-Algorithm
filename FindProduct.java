class FindProduct{
	public static void product(int n){
       int fact = 1;
       for(int i=1;i<=n;i++){
           fact = fact*i;	
       }
       System.out.println(fact); 
	}
	public static void main(String[] args){
      product(Integer.parseInt(args[0]));
    }
}