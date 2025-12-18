import java.util.*;
public class SwapFirstLast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(s.length()>1){
            s=s.charAt(s.length()-1)+s.substring(1,s.length()-1)+s.charAt(0);
        }
        System.out.println(s);
    }
}
