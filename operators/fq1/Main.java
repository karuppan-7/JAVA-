/******************************************************************************

Q1.Write a Java Program to find area of Rectangle

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double l = sc.nextDouble();
        double b = sc.nextDouble();

        double area = l * b;

        System.out.println(area);
    }
}

