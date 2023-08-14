class FormTriangle{
 	public static boolean validTriangle(int n,int j,int k){
        boolean formTriangle = false;
        if((n+j>k) || (j+k>n) || (n+k>j)){
            System.out.println("Yes");
        }
        else{
         		System.out.println("No");
       	}
       return true;
	}
	public static void main(String[] args){
       validTriangle(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
	}
}