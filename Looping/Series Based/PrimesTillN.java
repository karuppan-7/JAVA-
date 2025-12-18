import java.util.*;
public class PrimesTillN {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            boolean p=true;
            for(int j=2;j<=i/2;j++) if(i%j==0){ p=false; break; }
            if(p) System.out.print(i+" ");
        }
    }
}
