import java.util.*;
public class SumNPositive {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0,c=0;
        while(c<n){
            int x=sc.nextInt();
            if(x>0){ sum+=x; c++; }
        }
        System.out.println(sum);
    }
}
