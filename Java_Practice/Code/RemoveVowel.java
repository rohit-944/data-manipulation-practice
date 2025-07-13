import java.util.*;

public class RemoveVowel {
    public static String removeVowels(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String s = sc.nextLine();
        System.out.println("Original String: " + s);

        
        System.out.println("String after removing vowels: " + removeVowels(s));

        sc.close();
    }
    
}
