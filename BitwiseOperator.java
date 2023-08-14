class BitwiseOperator{
	
	public static void main(String args[]){
      /* {
           int a = 42;
           int b = ~a; // (there is tilde sign before a)
           System.out.print(a + " " + b);     	
       }*/

       /* int x = 10;
       	     int y = 20;
       	     if(x++ > 10 || ++y > 20 ){
			System.out.print("Inside if  ");
       	     }else{
			System.out.print("Inside else  ");
       	     }
       	     System.out.println(x  + " " + y);
        }*/

        for(int i = 0; i < 2; i = i + 1) {
         for(int j = 0; j < 2; j = j + 1) {
              if (j == 1)
                  break;
              System.out.print(j);  // two 0 are printing ..why?
          } 
     } 
}
}
