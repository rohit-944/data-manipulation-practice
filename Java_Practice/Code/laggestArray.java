import java.util.*;

public class laggestArray {

    public static int largestnum(int arr[]) {
        // int l = Integer.MIN_VALUE;

        // for (int i = 0; i < arr.length; i++) {      
        //     if (l < arr[i]) {
        //         l = arr[i];
        //     }
        // }
        // return l;

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }   
        }
        return max;


        
    }


    public static void main(String[] args) {
        // int num[] = {2,4,5,6,7,15,1,2,6,8,9,6,5,7};

        // System.out.println("The largest nymber = " + largestnum(num));

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] num = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("The largest number = " + largestnum(num));

        sc.close();
    }


    
}
