class CNGeometricSum{
	
	public static double geometricSum(int k){

		if(k==0){
			return 1;
		}

		double result = geometricSum(k-1)+1/Math.pow(2,k);

		return result;
	}

	public static void main(String[] args){

		int k = 3;

		System.out.print(geometricSum(k));
	}
}