import java.util.*;
public class RemoveZeroes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String res="";
        for(char c:s.toCharArray())
            if(c!='0') res+=c;
        System.out.println(res);
    }
}
