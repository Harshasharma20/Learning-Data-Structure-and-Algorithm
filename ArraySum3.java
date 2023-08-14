class ArraySum3{
	public static void main(String[] args){
		int sum=0;
		double average=0;
		int[] a = new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		int size=a.length;
		for(int i=0;i<size;i++){
			sum=sum+a[i];
			average=sum/size;
		}
		System.out.println("The Total array sum is : " +sum);
		System.out.println("The Average array sum is : " +average);

	}
}