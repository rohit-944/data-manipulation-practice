import java.util.*;
public class CountVowel {

    public static int countvowel(String str){
        int count = 0;
        str= str.toLowerCase();

        for(int i = 0; i<str.length(); i++){

            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == '0'|| ch == 'u'){
                count++;
            }
        }
        return count;

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sc.nextLine();

        System.out.println("There are " +countvowel(str)+ " vowels in the string.");

        sc.close();
    }
    
}
