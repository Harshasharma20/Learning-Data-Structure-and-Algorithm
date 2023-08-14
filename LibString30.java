class LibString30{
	
	public static String compressString(String str){

		int count = 1;

		String newString = "";

		for(int i=0;i<str.length();i++){

			char currentChar = str.charAt(i);

			for(int j = i+1;j<str.length();j++){

				if(str.charAt(j) == currentChar){

					count = count + 1;					

				}

				else {

					break; //exit inner loop when the characte changes

					//currentChar = str.charAt(i);
				}

			}

			newString = newString+currentChar+count;
				count = 1;
							
	}

		return newString;


	}

	public static void main(String[] args){

		String s = "aaabbccdsa";

		String result = compressString(s);

		System.out.print(result);

	}
}