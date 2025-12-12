/******************************************************************************

A person deposits money in the bank. Using the formula SI = (P × R × T) / 100,
the program computes simple interest.

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("P: ");
        double p = sc.nextDouble();

        System.out.print("R: ");
        double r = sc.nextDouble();

        System.out.print("T: ");
        double t = sc.nextDouble();

        double si = (p * r * t) / 100;

        System.out.println("Simple Interest: " + si);
    }
}
