import java.util.*;
public class PerfectTillN {
    static boolean perfect(int x){
        int s=0;
        for(int i=1;i<x;i++) if(x%i==0) s+=i;
        return s==x;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) if(perfect(i)) System.out.print(i+" ");
    }
}
