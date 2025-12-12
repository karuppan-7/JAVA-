/******************************************************************************
A student measures experiment time in minutes but needs the time in seconds.
The program should convert minutes into seconds.

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Minutes: ");
        int min = sc.nextInt();

        int sec = min * 60;

        System.out.println("Seconds: " + sec);
    }
}
