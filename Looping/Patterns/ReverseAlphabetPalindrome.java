import java.util.*;
public class ReverseAlphabetPalindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++) System.out.print(" ");
            for(char c=(char)('A'+i-1);c>='A';c--) System.out.print(c);
            for(char c='B';c<=(char)('A'+i-1);c++) System.out.print(c);
            System.out.println();
        }
    }
}
