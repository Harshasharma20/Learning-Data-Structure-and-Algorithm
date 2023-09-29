class CNStringToInteger{
	
	public static int stringToInt(String input){

		//Base case:
		if(){
			return input;
		}

		//Small Calculations:
		int ans = Integer.parseInt(String.valueOf(charAt(0)));

		//recursive call
		int  result = stringToInt(input.substring(1));

		return ans + result;


	}
}