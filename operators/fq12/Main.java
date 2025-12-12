/******************************************************************************
Q12.Write a Java Program to find Surface Area, Volume, and Perimeter of a Javaube

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();

        double SA = 6 * a * a;
        double V = a * a * a;
        double P = 12 * a;

        System.out.println(SA);
        System.out.println(V);
        System.out.println(P);
    }
}
