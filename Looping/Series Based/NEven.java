import java.util.*;
public class NEven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=0,i=2;
        while(c<n){
            System.out.print(i+" ");
            i+=2; c++;
        }
    }
}
