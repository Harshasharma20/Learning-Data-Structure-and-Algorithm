class BinaryToDecimal{	
	public static void main(String[] args){
		int n=111,temp=n,i=0,d=0,rem;
		//System.out.println(Integer.parseInt("1100",2));		
		while(temp>0){
			rem = temp%10;
			temp = temp/10;
			d = d + rem * (int)Math.pow(2,i++);
		}
		System.out.println(d);
	}
}