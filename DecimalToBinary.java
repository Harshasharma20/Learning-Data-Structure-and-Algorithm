class DecimalToBinary{	
	public static void main(String[] args){
		int n = 12, temp = n, rem;
		String s = "";
		while(temp>0){
			rem = temp%2;
			temp = temp/2;
			s = rem + s;
		}
		System.out.println(s);
	}
}