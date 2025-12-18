import java.util.*;
public class StrongTillN {
    static int fact(int n){
        int f=1; for(int i=1;i<=n;i++) f*=i; return f;
    }
    static boolean strong(int x){
        int t=x,s=0;
        while(x>0){ s+=fact(x%10); x/=10; }
        return s==t;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) if(strong(i)) System.out.print(i+" ");
    }
}
