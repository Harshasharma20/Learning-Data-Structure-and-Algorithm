class LibString22{
	
	public static boolean palindrome(String s){

	boolean result = true;

    for (int i = 0; i < s.length() / 2; i++) {
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            result = false;
            break;
        }
    }

    return result;

	}

	public static void main(String[] args){

		String s = "abcd";
		System.out.print(palindrome(s));
	}
}