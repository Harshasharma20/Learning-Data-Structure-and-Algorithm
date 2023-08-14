class FahrenheitToCelcius{
	
	public static void main(String[] args){

		int s=20,e=119,step_size=13,c=0;

		while(s<=e){

			c = ((s-32)*5)/9;
			System.out.println(s+"\t"+c);
			s = s+step_size;

		}
		
	}
}