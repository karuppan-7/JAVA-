import java.util.*;
public class MagicTillN {
    static boolean magic(int x){
        while(x>9){
            int s=0;
            while(x>0){ s+=x%10; x/=10; }
            x=s;
        }
        return x==1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) if(magic(i)) System.out.print(i+" ");
    }
}
