class CNEncodingString{
	
	public static String encode(String message) {
		
		String newString = "";
		int count = 0;
		for(int i=0;i<message.length();i++){
			
			if(i==0){

				newString = newString + message.charAt(0);
				count++;
			}
			if(i!=0 && message.charAt(i) == message.charAt(i-1)){
				count++;
			}
			else if(i!=0 && message.charAt(i) != message.charAt(i-1)){
				newString = newString + count + message.charAt(i);
				count=1;
			}
			if(i == message.length()-1){

				newString = newString + count;

			}
		}
		

		return newString;
	}

	public static void main(String[] args){

		String string = "aaaabbbccdaa";
		System.out.print(encode(string));
	}
}