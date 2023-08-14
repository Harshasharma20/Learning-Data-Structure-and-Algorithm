class GCD{	
	public static int findGCD(int a,int b){
		if(a==0)
			return b;
		    return findGCD(b%a,a);
}
	public static void main(String[] args){        
          int a=10,b=15,g;
          g=findGCD(a,b);
          System.out.println("GCD(" +a+ "," +b+ ")  = " +g);
	}
}