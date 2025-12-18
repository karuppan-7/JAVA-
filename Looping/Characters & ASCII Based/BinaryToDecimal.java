import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int dec=0,p=1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1') dec+=p;
            p*=2;
        }
        System.out.println(dec);
    }
}
