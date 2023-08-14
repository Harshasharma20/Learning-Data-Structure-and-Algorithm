class PositiveNegative{
	public static int checkNumber(int n){
       int output = 3;
       if(n>0){
          output = 1;
       }
       else if(n<0){
          output = -1;
       }
       else{
         output = 0;
       }
      return output;
    }
    public static void main(String[] args){
      System.out.println(checkNumber(Integer.parseInt(args[0])));
    }
}