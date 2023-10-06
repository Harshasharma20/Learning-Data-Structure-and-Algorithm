class ReverseStringRecursion{
	
	public static String reverseString(String str){

		if(str.length()<=1){ // Base case: If the string is empty or has only one character, return it as is.

			return str;
		}

		char lastChar = str.charAt(str.length()-1); // Get the last character of the string.

		String remainingString = str.substring(0, str.length() - 1); // Get the substring without the last character.


		// Recursively reverse the remaining substring and concatenate the last character.
    	String reversedSubstring = reverseString(remainingString) + lastChar;


		return reversedSubstring;

	}

	public static void main(String[] args){

		String str ="abcd";
		reverseString(str);

	}
}