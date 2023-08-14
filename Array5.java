import java.util.*;
class Array5{
	public static void main(String[] args){
		int b=50;
		int[] a=new int[4];
		a[0]=40;
		a[1]=20;
		a[2]=10;
		a[3]=50;
		Arrays.sort(a);
		System.out.println(isContain(b));
		/*for(int number:a){
			System.out.println(number);
		}*/

	public static boolean isContain(int value){
	//	boolean contains=false;
		for(int i=0;i<a.length;i++){
			if(value==a[i]){
				return true;
			}
			else{
				return false;
			}
		}
		return true;
        }
    }
}