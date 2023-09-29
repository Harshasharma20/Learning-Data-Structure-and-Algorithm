import java.util.*;
class ArraySubset {

    public static String isSubset( long a1[], long a2[], long n, long m) {

   /* String output = "Yes"; // Assume a2 is a subset until proven otherwise

    boolean found = false;

    for (int i = 0; i < m; i++) {
           

        for (int j = 0; j < n; j++) {
            if (a2[i] == a1[j]) {
                found = true;
                break; // If the element is found in a1, move to the next element in a2
            }
        }

        if (!found) {
            output = "No"; // If an element in a2 is not found in a1, a2 is not a subset
            break;
        }
    }

    return output;

    }
*/

    ArrayList<Long> list1 = new ArrayList<>();
    

    for (int i = 0; i < a1.length; i++) {
        list1.add(a1[i]);
    }

    for (int i = 0; i < a2.length; i++) {
        if (list1.contains(a2[i])) {
            list1.remove(a2[i]);
        } else {
            return "No";
        }
    }
    return "Yes";
    }
    public static void main(String[] args){

        long a1[] = {10,5,2,23,19};
        long a2[] = {19,5,3};

        Arrays.sort(a2);

        int n = a1.length;
        int m = a2.length;

        System.out.print(isSubset(a1,a2,n,m));



    }
}