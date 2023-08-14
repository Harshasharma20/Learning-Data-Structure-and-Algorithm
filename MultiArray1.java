class MultiArray1{
	public static void main(String[] args){
		/*int[][] a=new int[4][];
		a[0]=new int[3];
		a[1]=new int[4];
		a[2]=new int[1];
		a[3]=new int[2];

	    a[0][0]=10;
	    a[0][1]=20;
	    a[0][2]=30;
	    a[1][0]=40;
	    a[1][1]=50;
	    a[1][2]=60;
	    a[1][3]=70;
	    a[2][0]=80;
	    a[3][0]=100;
	    a[3][1]=120;
	    System.out.println(a[0][2]);*/

	    int[] a={10,20,30,40,50,60,70};
        int[] b={80,90};
        a=b;//(valid)
        b=a;//(valid
        System.out.println(a[1]);

	}
}