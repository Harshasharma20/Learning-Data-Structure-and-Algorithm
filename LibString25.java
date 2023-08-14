import java.util.Arrays;
class LibString25{
	
	public static boolean checkPermutation(String s1, String s2){

		boolean result = false;

		//Step 1 - convert string into char Array
		char charArray1[] = s2.toCharArray();

		for(int i=0;i<s2.length();i++){

			charArray1[i]=s2.charAt(i);
		}
		
		//Step 2 - Sort the charArray
		Arrays.sort(charArray1);

		//Step 3 - Convert Char Array to String
		String s3 = new String(charArray1);

		if(s1.equals(s3) && s1.length() == s3.length()){

			result = true;
		}

		else{

			result = false;
		}

		
		return result;
	}

	public static void main(String[] args){

		String s1 = "abc";
		String s2 = "cbd";

		System.out.print(checkPermutation(s1,s2));


	}
}