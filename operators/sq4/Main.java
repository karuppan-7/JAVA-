/******************************************************************************

A fitness trainer tracks running distances in meters. Athletes give distance in kilometers, so the program converts km → meters.

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Speed: ");
        double speed = sc.nextDouble();

        System.out.print("Time: ");
        double time = sc.nextDouble();

        double dist = speed * time;

        System.out.println("Distance: " + dist + " km");
    }
}

