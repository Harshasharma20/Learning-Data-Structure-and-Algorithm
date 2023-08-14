class LibString27{
	
	public static String reverseWordsWise(String s){

		//Convert String into array using split()
		String arr[] = s.split(" ");

		//Create new empty String
		String newString = "";

		//Apply for each loop for accessing the elements one by one.
		for(String result : arr){

			//Create StringBuilder Object 

			StringBuilder strBuilder = new StringBuilder(result);
			strBuilder.reverse();

			//Add all each words in new String
			newString = newString + strBuilder.toString()+ " ";

		}

		return newString;
	}

	public static void main(String[] args){

		String s = "Welcome to Coding Ninjas";

		System.out.print(reverseWordsWise(s));
	}
}