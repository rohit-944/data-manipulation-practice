import java.util.Arrays;

public class StringReverse {

    public static void main(String[] args) {
        String s =" i like this program very much ";
        s=s.trim();
        System.out.println(s);
        String arr[] = s.split(" ");
        System.out.println(Arrays.toString(arr));
        

        StringBuilder sb= new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i] +" ");
            // sb.append(" ");
        }
        String res=sb.toString();
        res=res.substring(0, res.length()-1);
        System.out.println(res);
        

    }
    
}
