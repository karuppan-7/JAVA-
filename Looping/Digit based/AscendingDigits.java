import java.util.*;
public class AscendingDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        boolean asc=true;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)>s.charAt(i+1)){
                asc=false; break;
            }
        }
        System.out.println(asc);
    }
}
