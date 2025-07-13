import java.util.*;
public class StringDuplicate {
    public static void main(String[] args) {
        
        String str = "Programming";
        char[] chars = str.toCharArray();
        Map<Character, Integer> mp= new HashMap<>();

        for(char c: chars){
            mp.put(c, mp.getOrDefault(c, 0)+1);
        }
        for(Map.Entry x:mp.entrySet()){
            if((int)x.getValue() !=1){
                System.out.print(x.getKey()+ " ");
            }
        }
        // System.out.println(mp);

        // Geeks for Geeks Solution   
        // int[] freq = new int[26];
        
        // for(char ch:s.toCharArray()){
        //     freq[ch-'a']++;
        // }
        // for(char ch:s.toCharArray()){
        //     if(freq[ch-'a'] == 1){
        //         return ch;
        //     }
        //     return '$';
        // }
    }

    

    
}
