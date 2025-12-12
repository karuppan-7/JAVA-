/******************************************************************************

A bakery produces a fixed number of cakes every hour.
Given cakes per hour and total hours, the program calculates total cakes made.

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cakes/Hour: ");
        int cph = sc.nextInt();

        System.out.print("Hours: ");
        int hrs = sc.nextInt();

        int total = cph * hrs;

        System.out.println("Total Cakes: " + total);
    }
}
