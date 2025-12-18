import java.util.*;
public class EvenOddDifference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), es=0, os=0;
        while(n>0){
            int d=n%10;
            if(d%2==0) es+=d;
            else os+=d;
            n/=10;
        }
        System.out.println(es-os);
    }
}
