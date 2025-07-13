

package Array;
import java.util.*;

public class MoveZeroLast {
        
    public void pushZerosToEnd(int[] arr) {
    
        int j = 0;

        // Move all non-zero elements to the beginning of the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j++] = arr[i];
            }
        }

        // Fill remaining positions with zero
        while (j < arr.length) {
            arr[j++] = 0;
        }
    }

    // Optional: For testing
    public static void main(String[] args) {

        MoveZeroLast m = new MoveZeroLast();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        m.pushZerosToEnd(arr);

        System.out.println("Array after moving zeros to the end: " + Arrays.toString(arr));

        sc.close();     
        
    }

    
}
