import java.util.*;
public class CountBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int one=0,zero=0;
        for(char c:s.toCharArray()){
            if(c=='1') one++;
            else if(c=='0') zero++;
        }
        System.out.println("1s="+one);
        System.out.println("0s="+zero);
    }
}
