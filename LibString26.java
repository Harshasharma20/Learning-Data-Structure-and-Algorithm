class LibString26{
	
	public static String removeDuplicatesConsecutives(String s){

		char ch = s.charAt(0);

		String newString = "";

		newString = newString + ch;

		for(int i=1;i<s.length();i++){

			if(s.charAt(i) == ch)

					//do not print anything

			else{

				newString = newString + s.charAt(i);
			}

			ch = s.charAt(i);
		}

		return newString;
	}

	public static void main(String[] args){

		String s = "aabccbaa";

		System.out.print(removeDuplicatesConsecutives(s));
	}
}