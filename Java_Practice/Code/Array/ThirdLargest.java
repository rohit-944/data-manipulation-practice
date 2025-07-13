package Array;

import java.util.*;

public class ThirdLargest {

    public static int findThirdLargest(int[] arr) {
        
        Arrays.sort(arr);
        
        int n = arr.length;
        if(n<3){
            return -1;
        }
        int res = arr[n-3];
        return res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = findThirdLargest(arr);
        System.out.println("The Third Largest Number is : " + res);

        sc.close();
    }
}
