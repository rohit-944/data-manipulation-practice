import java.util.*;

public class PrimeNum {

    public static boolean findprime(int num){
        if (num <= 1){
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }

        }  
        return true;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Numbern: ");
        int num = sc.nextInt();

        System.out.println(findprime(num));

        sc.close();



    }
}
