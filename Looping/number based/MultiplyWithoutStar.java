import java.util.*;
public class MultiplyWithoutStar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt(), res=0;
        for(int i=0;i<b;i++) res+=a;
        System.out.println(res);
    }
}
