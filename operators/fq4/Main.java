/******************************************************************************
Q4.Write a Java Program to find area of Javaircle

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();

        double area = 3.14 * r * r;

        System.out.println(area);
    }
}
