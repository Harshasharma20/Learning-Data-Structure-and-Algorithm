import java.util.*;
class ArrayPractice1{
	public static void main(String[] args){

		int marks[] = new int[100];

		//taking input
		Scanner scanner = new Scanner(System.in);
		marks[0] = scanner.nextInt();
		marks[1] = scanner.nextInt();
		marks[2] = scanner.nextInt();

		System.out.println("physics -- " +marks[0]);
		System.out.println("Chemistry -- " +marks[1]);
		System.out.println("maths -- " +marks[2]);

		marks[2] = marks[2] - 5; // we can make any operations here like multiply, divide, add, subtract, modulus
		System.out.println("maths -- " +marks[2]);

		// to find percentage
		int percentage = (marks[0] + marks[1] + marks[3])/3;
		System.out.println("Percentage = " +percentage+ "%");

		System.out.println("length of an array = " +marks.length);

	}
}