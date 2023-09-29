class CNRemoveX{
	
	public static String removeX(String str){

		if(str.length()==1){

			return str;
		}

		String newString = "";

		if(str.charAt(0)!='x'){

			newString = newString + str.charAt(0);
		}

		String ans = removeX(str.substring(1));

		return newString + ans;
	}

	public static void main(String args[]){

		String str = "xaxb";
		System.out.print(removeX(str));
	}
}