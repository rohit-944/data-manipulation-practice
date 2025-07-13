import java.util.Arrays;

public class ArrSort {

    public static int[] sortArray(int[] arr) {
        // int n = arr.length;
        // for (int i = 0; i < n - 1; i++) {
        //     for (int j = 0; j < n - i - 1; j++) {
        //         if (arr[j] > arr[j + 1]) {
        //             // swap arr[j] and arr[j + 1]
        //             int temp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //         }
        //     }
        // }
        // Using Arrays.sort() for simplicity
        Arrays.sort(arr); // sort the array using built-in method
        return arr; // return the sorted array
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array before sorting: " + Arrays.toString(arr));

        int[] sortedArr = sortArray(arr);

        System.out.println("Sorted array: " + Arrays.toString(sortedArr));
    }
}
