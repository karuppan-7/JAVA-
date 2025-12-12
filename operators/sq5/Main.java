/******************************************************************************

A fitness trainer tracks running distances in meters.
Athletes give distance in kilometers, so the program converts km → meters.

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("KM: ");
        int km = sc.nextInt();

        int meters = km * 1000;

        System.out.println("Meters: " + meters);
    }
}
