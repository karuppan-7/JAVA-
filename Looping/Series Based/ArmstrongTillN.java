import java.util.*;
public class ArmstrongTillN {
    static boolean arm(int x){
        int t=x,s=0,d=String.valueOf(x).length();
        while(x>0){ int r=x%10; s+=Math.pow(r,d); x/=10; }
        return s==t;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) if(arm(i)) System.out.print(i+" ");
    }
}
