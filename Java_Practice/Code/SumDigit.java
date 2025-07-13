import java.util.*;
public class SumDigit {

    public static int finddigitsum(int num){
        
        int sum = 0;
        while (num != 0) {
            sum += num % 10;  
            num /= 10;        
        }

        return sum;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("The sum of digits of " +num+ " is : " + finddigitsum(num));

        sc.close();

        
    }
    
}
