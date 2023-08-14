import java.util.*;
class LibString29{
	
	public static char countOccurenceChar(String str){
		/*
		int count = 1;

		char c = ' ';

		int max = Integer.MIN_VALUE;

		for(int i=0;i<str.length();i++){

			for(int j=i+1;j<str.length();j++){

				if(str.charAt(i) == str.charAt(j)){

					count = count + 1;

					c = str.charAt(i);

				}

				if(count>max){

					max = count;
				}

				if(str.charAt(i)!=str.charAt(j)){

					c = str.charAt(i);
				}

			}

		}

		return c;

		*/

		HashMap<Character, Integer> charCountMap = new HashMap<>();

    		for (int i = 0; i < str.length(); i++) {
        		char currentChar = str.charAt(i);
        		charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);
    		}

    		int maxCount = Integer.MIN_VALUE;
    		char resultChar = ' ';

    		for (char c : charCountMap.keySet()) {
        		int count = charCountMap.get(c);
        		if (count > maxCount) {
            		maxCount = count;
            		resultChar = c;
        	}
    }

    return resultChar;

	}

	public static void main(String[] args){

		String str = "abdefgbabfba";

		System.out.print(countOccurenceChar(str));
	}
}