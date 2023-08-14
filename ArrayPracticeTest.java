class ArrayPracticeTest{

        public static void change(int input[]){
		input = new int[5];
		input[0] = 202;
        }
	
        public static void main(String args[]){
            int arr[] = new int[5];
            //arr[0]=201;
           change(arr);   
           System.out.println(arr[0]);
        }
    }
	//public static void main(String[] args){

		/*boolean arr[] = new boolean[5];
		System.out.println(arr[0]);  //false*/

		/*int[] arr = new int[5];
	    arr = new int[6];*/

	//}