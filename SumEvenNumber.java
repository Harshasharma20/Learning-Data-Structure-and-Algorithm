class SumOfEvenNumber{
	public static void main(String[] args){
		int sum=0,i=1;
       System.out.println("Sum of Even Number are:" +doSumOfEvenNumber(12,0));
	}
	public static int doSumOfEvenNumber(int n,int sum){
        for(int i=0;i<=n;i++){
           	if(i%2==0){
           		sum=sum+i;
           	}
        }
        return sum;
	}
}