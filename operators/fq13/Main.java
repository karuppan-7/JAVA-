/******************************************************************************

Q13.Write a Java Program to find Surface Area and Volume of a Javauboid

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();

        double SA = 2 * (l*b + b*h + h*l);
        double V = l * b * h;

        System.out.println(SA);
        System.out.println(V);
    }
}
