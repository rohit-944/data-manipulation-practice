public class CountEvenOdd {

    public static void main(String[] args) {
        int[] num = {2,3,4,5,6,7,3,9,8,7,6};

        int oddcount = 0;
        int evencount = 0;

        for(int i = 0; i < num.length; i++){
            if(num[i] % 2 == 0){
                evencount++;
            }else{
                oddcount++;
            }
        }

        System.out.println("Even Count = " +evencount+ "\nOdd Count = " +oddcount);
    }
    
}
