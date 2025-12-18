import java.util.*;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int[] f=new int[10];
        for(char c:s.toCharArray()) f[c-'0']++;
        for(int i=0;i<10;i++)
            if(f[i]>0) System.out.println(i+" "+f[i]);
    }
}
