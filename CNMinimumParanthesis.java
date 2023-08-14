class CNMinimumParanthesis{
	
	public static int minimumParentheses(String pattern) {
		
		/*int closeCount = 0,openCount = 0, result = 0,output = 0;

		for(int i=0;i<pattern.length();i++){

			if(pattern.charAt(i) == '('){
				closeCount++;
			}
			else if(pattern.charAt(i) == ')'){

				openCount++;
			}

			//result = Math.abs(closeCount - (openCount));

			if(openCount!=closeCount){
				if(openCount<closeCount){
					result = Math.abs(closeCount-(openCount));
					output = result + openCount;
				}
				else if(openCount>closeCount){
					result = Math.abs(openCount + (closeCount)-1);
					output = result + closeCount;
				}
			}
		}

		return output;*/
		int closeCount = 0, openCount = 0, output = 0;

    for (int i = 0; i < pattern.length(); i++) {
        if (pattern.charAt(i) == '(') {
            openCount++;
        } else if (pattern.charAt(i) == ')') {
            if (openCount > 0) {
                openCount--;
            } else {
                closeCount++;
            }
        }
    }

   			 output = openCount + closeCount;
    		return output;

	}

	public static void main(String[] args){

		String pattern = "))(";
		System.out.print(minimumParentheses(pattern));
	}
}