/******************************************************************************

Q28. Java Program to check whether a point (x, y) lies in which quadrant

*******************************************************************************/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x and y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x > 0 && y > 0)
            System.out.println("First Quadrant");
        else if(x < 0 && y > 0)
            System.out.println("Second Quadrant");
        else if(x < 0 && y < 0)
            System.out.println("Third Quadrant");
        else if(x > 0 && y < 0)
            System.out.println("Fourth Quadrant");
        else if(x == 0 && y != 0)
            System.out.println("Lies on Y-axis");
        else if(y == 0 && x != 0)
            System.out.println("Lies on X-axis");
        else
            System.out.println("Origin");
    }
}

