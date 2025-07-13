
import java.util.*;
public class Factorial {

    public static int findfectorial(int num){
        int f = 1;
        for(int i = 1; i<= num; i++){
            // f = f *i;
            f *= i;
        }
        return f;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        System.out.println("The Factorial of " +num+ " is : " +findfectorial(num));

        sc.close();
    }
    
}
