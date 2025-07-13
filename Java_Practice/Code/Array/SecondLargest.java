package Array;
import java.util.*;
public class SecondLargest {

    public static int findSecondLargest(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        int largest = arr[n-1];
        for(int i = n-2; i >= 0; i++){
            if(arr[i] != largest){
                return arr[i];
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int res = findSecondLargest(arr);
        System.out.println("The Largest Number is : " + res);

        sc.close();
    }
}
