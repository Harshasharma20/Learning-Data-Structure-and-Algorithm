class ArrayPractice9{
	
	public static void getPair(int numbers[]){
		int totalPair=0;
		for(int i=0;i<numbers.length;i++){
			int currentNumber = numbers[i];
			for(int j=i+1;j<numbers.length;j++){
				System.out.print("(" +currentNumber+ "," +numbers[j]+ ")");
				totalPair++;
			}
			System.out.println();
		}
		System.out.print("Total pair is " +totalPair);

	}

	public static void main(String[] args){

		int numbers[] = {2,4,6,8,10};
		getPair(numbers);

	}
}