import java.util.*;
class ReverseANumber{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		String inputNum = String.valueOf(n);
		String outputNum = "";
		int size = inputNum.length();
		for(int i = 1;i<=size;i++){
			outputNum +=inputNum.substring(size-i, size+1-i);
		}
		System.out.println(Integer.parseInt(outputNum));
	}
}