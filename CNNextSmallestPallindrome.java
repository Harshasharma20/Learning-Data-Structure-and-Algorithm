class CNNextSmallestPallindrome{
	
	public static String nextLargestPallindrome(String number, int length){
		String mid = "",left="",right="",reversedLeft="";
		String reversedNumber = "";
		//First we'll check if number is pallindrome or not

		for(int i=number.length()-1;i>=0;i--){

			reversedNumber = reversedNumber + number.charAt(i);
		}

		if(number.equals(reversedNumber)){

			return number;
		}

		//Check if number even or odd

		//if number is odd:

		if(number.length()%2!=0){

			//to find mid point of number
			mid = String.valueOf(number.charAt(number.length() / 2));

			//to find left of the number:
			for(int i=0;i<number.length()/2;i++){
				left = left + number.charAt(i);
			}

			//to find right of the number:
			for (int i = number.length() / 2; i < number.length(); i++) {
    			right = right + number.charAt(i);
			}

			

			//to reversed of left:
			for(int i=left.length()-1;i>=0;i--){
				reversedLeft = reversedLeft + left.charAt(i);
			}

			if(reversedLeft.compareTo(right) > 0){


			}

			else{
				int midInt = Integer.parseInt(mid);
					mid = String.valueOf(midInt + 1);

			}

			 return left + mid + reversedLeft;
		}

		 return left + mid + reversedLeft;
	}

	public static void main(String args[]){
		String number = "121";
		int length = number.length()-1;

		System.out.print(nextLargestPallindrome(number,length));
	}

}