import java.util.Scanner;

public class StringPalindrome {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");

        String str = sc.next();

        System.out.println(IsPalindrome(str));

        sc.close();
    }

    public static Boolean IsPalindrome(String str) {
        
        // for(int i = 0; i < str.length(); i++){
        //     int n = str.length();
        //     if(str.charAt(i) != str.charAt(n-i-1)){
        //         return false;
        //     }
        // }
        // return true;

        int n = str.length();

        for (int i = 0; i< n; i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }

        }
        return true;
    }
    
}
