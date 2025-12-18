import java.util.*;
public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt(), res=1;
        for(int i=1;i<=m;i++) res*=n;
        System.out.println(res);
    }
}
