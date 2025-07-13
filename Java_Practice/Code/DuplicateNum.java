public class DuplicateNum {

    public static void main(String[] args) {
        
        int[] arr = {2, 4, 6, 4, 7, 2, 8, 9, 6};

        // System.out.print("Duplicate elements are : ");
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i+1; j < arr.length; j++) {
        //         if (arr[i] == arr[j]) {
        //             System.out.print(" " +arr[i]);
        //             break;
        //         }
        //     }
        // }
        System.out.println("Duplicate elements are : ");
        for (int i = 0; i < arr.length; i++) {  
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break; // Break to avoid printing the same duplicate multiple times
                }
            }
        }
    }
    
}
