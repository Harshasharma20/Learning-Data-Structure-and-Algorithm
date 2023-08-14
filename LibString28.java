class LibString28{
	
	public static String removeCharacter(String str,char c){

		String newString = "";

		for(int i=0;i<str.length();i++){

			char ch = str.charAt(i);

			if(ch == c){}

				else{

					newString = newString + ch;

				}
		}

		return newString;

	}

	public static void main(String[] args){

		String str = "Think of edge cases before submitting solutions";
		char c = 'x';

		System.out.print(removeCharacter(str,c));
	}
}