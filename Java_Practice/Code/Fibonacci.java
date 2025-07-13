import java.util.*;
public class Fibonacci {

    public static int findfibonacci(int num){
        if(num <= 1){
            return num;
        }

        int a = 0, b = 1, fib = 1;

        for(int i = 2; i <= num; i++){
            fib = a + b;
            // System.out.print(" " +fib);
            a = b;
            b = fib;

        }
        System.out.println();

        return fib;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("The Fibonacci of " +num+ " is : " +findfibonacci(num));

        sc.close();
        
        
    }
}
