import java.util.*;
class ArrayPractice13{
	
	public static void arrangeNumber(int nums[], int size){

		int left =0, right = size-1,num=1;

		while(left<=right){

			if(num%2==1){
				nums[left] = num;
				num++;
				left++;

				//System.out.print();
			}
			else{
				nums[right] = num;
				num++;
				right--;
				//System.out.print(right);
			}
		}

		//System.out.print(count);

	}

	public static void main(String[] args){

		int array=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of the array");

		int size = scan.nextInt();

		int nums[] = new int[size];

		arrangeNumber(nums,size);

		
	}
}