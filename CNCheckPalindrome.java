class CNCheckPalindrome{
	
	public static boolean checkPalindrome(String input){

		//base case:
		if(input.length()==1){
			return true;
		}

		if(input.charAt(0)!=input.charAt(input.length()-1)){
			return false;
		}

		boolean ans = checkPalindrome(input.substring(1,input.length()-1));

		return ans;
	}

	public static void main(String[] args){

		String input = "racecar";

		System.out.print(checkPalindrome(input));
	}
}