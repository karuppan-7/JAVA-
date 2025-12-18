import java.util.*;
public class DigitWords {
    static String word(int d){
        String[] w={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        return w[d];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(char c:s.toCharArray())
            System.out.print(word(c-'0')+" ");
    }
}
