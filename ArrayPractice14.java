class ArrayPractice14{
	
	public static void printSubarrays(int numbers[]){
		int ts = 0;int sum1=0, sum2=0,sum3=0;
		for(int i=0;i<numbers.length;i++){
			int start = i;
			sum1 = numbers[i]+sum1;
			for(int j=1;j<numbers.length;j++){
				int end = j;
				//sum2 = numbers[j]+sum2;
				for(int k=start;k<=end;k++){
					sum3 = sum1+sum2;
					System.out.print(numbers[k]+ " ");
					//System.out.print(sum3);
					
				}
				System.out.print(sum3);
				ts++;
				
				System.out.println();

			}

			System.out.println();
		}
		//System.out.print(sum);
		System.out.println("Total sub array = "+ts);
	}

	public static void main(String[] args){

		int numbers[] = {2,4,6,8,10};
		printSubarrays(numbers);
	}
}