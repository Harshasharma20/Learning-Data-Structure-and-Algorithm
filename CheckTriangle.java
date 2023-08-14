class CheckTriangle{
	public static int observeAndIdentifyTriangle(int firstside, int secondside, int thirdside){
        int finalOutput = 2;
		if(isTriangleValid(firstside,secondside,thirdside)){
		   if(firstside==secondside && secondside==thirdside){
				finalOutput = 1;
		   }
			else if(firstside==secondside || secondside==thirdside || thirdside==firstside){
				finalOutput = 0;
			}
			else{
				finalOutput = -1;
			}
		}
	return finalOutput;	
}	
	public static boolean isTriangleValid(int first_side,int second_side,int third_side){
        boolean validTriangle = false;
   		if(first_side+second_side>third_side || second_side+third_side>first_side || first_side+third_side>=second_side){
                validTriangle = true;
		}
		return validTriangle;
	}
	public static void main(String[] args){
		//System.out.println(observeAndIdentifyTriangle(8, 8, 7));
		System.out.println(isTriangleValid(8, 8, 7));
	}
}
// one thing we have missed here which is we are directly checking whether the triangle is equilateral, or isosceles, or scalene but before
// checking this condition we must validate whether the triangle is valid or not. Now your task it to check how we can check for the 
// triangle validity. you can also use the google and modify this program accordingly

// for now baby bye we will talk later see you : )
// also try to code some of the program
//Oky darling:))

//Todo
//* Methods
//* Explanation of every code.
//* Loops
