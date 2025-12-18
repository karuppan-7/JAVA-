import java.util.*;
public class PowerOfTwoTillN {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),p=1;
        while(p<=n){
            System.out.print(p+" ");
            p*=2;
        }
    }
}
