import java.util.*;
public class PowerOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>1 && n%3==0) n/=3;
        System.out.println(n==1);
    }
}
