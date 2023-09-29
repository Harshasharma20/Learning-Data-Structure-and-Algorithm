class CNReplacePI{
	
	public static String replacePi(String str){

		if(str.length()<=1){
			return str;
		}

		// Check if "pi" is at the beginning of the string.
	    if (str.startsWith("pi")) { //The startsWith() method checks whether a string starts with the specified character(s).
	        // Replace "pi" with "3.14" and recursively call the function on the remaining part.
	        return "3.14" + replacePi(str.substring(2));
	    } else {
	        // If "pi" is not at the beginning, keep the current character and recursively call the function on the rest.
	        return str.charAt(0) + replacePi(str.substring(1));
	    }
	}

	public static void main(String[] args){w

		String str = "xpix";

		System.out.print(replacePi(str));
	}
}