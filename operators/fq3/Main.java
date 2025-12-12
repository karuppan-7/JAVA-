/******************************************************************************

Q3.Write a Java Program to find area of Triangle
*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double b = sc.nextDouble();
        double h = sc.nextDouble();

        double area = 0.5 * b * h;

        System.out.println(area);
    }
}
