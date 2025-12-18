import java.util.*;
public class FirstNPrimes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=0,i=2;
        while(c<n){
            boolean p=true;
            for(int j=2;j<=i/2;j++) if(i%j==0){ p=false; break; }
            if(p){ System.out.print(i+" "); c++; }
            i++;
        }
    }
}
