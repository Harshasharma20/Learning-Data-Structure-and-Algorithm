class CNPairStar{
	
	public static String pairStar(String input){

		//Base case:
		if(input.length() <= 1){
			return input;
		}

		String newString = "";

		if(input.charAt(0)!= input.charAt(1)){

			newString = newString + input.charAt(0);
		}
		//small calculation
		else{
			newString = newString + input.charAt(0) + "*";
		}

		//recursive call
		String ans = pairStar(input.substring(1));

		return newString + ans;

	}

	public static void main(String[] args){

		String input = "aaaa";
		System.out.print(pairStar(input));
	}
}