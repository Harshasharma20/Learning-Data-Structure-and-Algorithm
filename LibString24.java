class LibString24{
	
	public static String reverseWords(String s){

		int i = s.length()-1;

		String ans = "";

		while(i>=0){

			while(i>=0 && s.charAt(i) == ' ') //check at the end of the string, 
				                             //is there any space and if there is space, decrement the i.

				i--;

			int j = i;

			if(i<0)

				break;

			while(i>=0 && s.charAt(i) != ' ')

				i--;

			if(ans.isEmpty()){

				ans = ans.concat(s.substring(i+1,j+1));
			}

			else{

				ans = ans.concat(' ' + s.substring(i+1,j+1));
			}

		}

		return ans;
	}

	public static void main(String[] args){

		String s = "Always indent your code";

		System.out.println(reverseWords(s));
	}
}