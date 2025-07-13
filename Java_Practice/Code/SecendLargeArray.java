import java.util.*;

public class SecendLargeArray {

    public static int getSecondLargest(int[] arr){

        int max = 0;
        int smax = 0;
        for(int i = 0; i < arr.length; i++){

            if(arr[i] > max ){
                smax = max;
                max = arr[i];

            }
            if(arr[i] <= max && arr[i] > smax){
                smax = arr[i];
            }
            
            
        }
        return smax;
        
        
        
        
        // int n = arr.length;
        // Arrays.sort(arr);
        // int sl = arr[n-1];

        // for (int i = n-2; n>=0; i--){
        //     if(arr[i] != sl){
        //         return arr[i];
        //     }
        // }
        // return -1;


    }

    public static void main(String[] args) {
        int[] arr = {12, 35,1 ,35 , 10, 34, 1};
        int secondLargest = getSecondLargest(arr);
        System.out.println("The second largest element is: " + secondLargest);
        
    }
    
}
