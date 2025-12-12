/******************************************************************************

Q15.Write a Java Program to find Surface Area and Volume of a Javaylinder
*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double h = sc.nextDouble();

        double SA = 2 * 3.14 * r * (h + r);
        double V = 3.14 * r * r * h;

        System.out.println(SA);
        System.out.println(V);
    }
}
