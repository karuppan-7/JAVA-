/******************************************************************************

Q14.Write a Java Program to find Surface Area and Volume of a Sphere

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();

        double SA = 4 * 3.14 * r * r;
        double V = (4.0/3) * 3.14 * r * r * r;

        System.out.println(SA);
        System.out.println(V);
    }
}
