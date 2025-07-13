import java.util.Scanner;

public class NumberDividedBy {
    public static void printDivisible(int n) {
        System.out.println("Numbers divisible by 3 and 5 from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        printDivisible(n);

        sc.close();
    }
    
}
