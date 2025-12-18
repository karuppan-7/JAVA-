import java.util.*;
public class CountDigitOccurrence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), d=sc.nextInt(), count=0;
        while(n>0){
            if(n%10==d) count++;
            n/=10;
        }
        System.out.println(count);
    }
}
