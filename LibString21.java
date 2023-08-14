import java.lang.*;
class LibString21{
	
	public static void countWords(String s){

		int count = 0;

		boolean isWord = false;

		for(int i=0;i<s.length();i++){

			char c = s.charAt(i);

			if(Character.isWhitespace(c)){

				isWord = false;
								
			}

			else if(!isWord){

				isWord = true;

				count= count+1;

			}
	}
	System.out.print(count);
}

	public static void main(String[] args){

		String s = "coding is awesome";
		countWords(s);

	}
}