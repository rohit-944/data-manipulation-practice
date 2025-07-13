import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateCheck {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();

        // My name is navin ranjan is ok for me

        // String [] arr=str.split(" ");

        // HashSet<String> st= new HashSet<>();
        // for(String x:arr){
        //     st.add(x);
        // }

        // StringBuilder sb = new StringBuilder();
        // for(String s:st){
        //     sb.append(s + " ");
        // }
        // String res=sb.toString();
        // System.out.println(res + " "+ res.length());

        // res=res.substring(0,res.length()-1);
        // System.out.println(res + " "+ res.length());
        // System.out.println(st);


        char [] arr = str.toCharArray();
        
        int[] flag=new int[26];
        //HashSet<Character> hs=new HashSet<>();
        for(char c:arr){
            flag[c-'a']=1;
        }
        System.out.println(Arrays.toString(flag));

        String res="";

        for( int i=0; i<26; i++){
            if(flag[i]==1){
                char c=(char) ('a'+ i);
                res=res+c;
            }
        }

        System.out.println(res);
        // StringBuilder sb=new StringBuilder();
        // for(char x: hs){
        //     sb.append(x);
        // }

        //System.out.println(sb.toString());
        





        sc.close();
    }
    
}
