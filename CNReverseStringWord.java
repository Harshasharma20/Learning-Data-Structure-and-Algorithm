class CNReverseStringWord{
	
	public static String reverseStringWord(String input){

		String newString = "";

		int j = input.length();

		for(int i=input.length();i>=0;i--){

			if(Character.isWhitespace(i)){

				for(int k=i+1;k<=j;k++){

					newString = newString + input.substring(i,j);

				}
			}

			
		}

		return newString;
	}

	public static void main(String[] args){

		String input = "Welcome to coding ninja";
		System.out.print(reverseStringWord(input));
	}
}