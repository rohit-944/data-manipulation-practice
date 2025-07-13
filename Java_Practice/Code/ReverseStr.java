import java.util.Scanner;

public class ReverseStr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to reverse:");

        String a = sc.nextLine();

        String res = reverseString(a);
        System.out.println("Reversed string: " + res);

        sc.close();
    }




    public static String reverseString(String str) {

        StringBuilder sb = new StringBuilder(str);

        // for (int i = str.length(); i < 0; i++) {
        //     sb.append(str.charAt(i));
        // }


        // return  sb.toString();

        String res = sb.reverse().toString();

        return res;


    }

}
