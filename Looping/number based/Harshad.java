import java.util.*;
public class Harshad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), sum=0, temp=n;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        System.out.println(temp%sum==0);
    }
}
