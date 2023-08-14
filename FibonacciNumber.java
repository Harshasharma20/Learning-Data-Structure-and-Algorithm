class FibonacciSeries{
	public static void printFibSeries(int n){
      int firstNum=0,secondNum=1,counter=0,sum=0;
      while(counter<n){
      System.out.println(firstNum+ " ");  
          sum = firstNum +secondNum;
      	 firstNum = secondNum;
      	 secondNum = sum;
      	 counter = counter + 1;
      }     
   }
	public static void main(String[] args){
		int n = 10;     
        printFibSeries(n);
	}
}