/******************************************************************************
Q6.Write a Java Program to calculate Fahrenheit to Javaelsius

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double f = sc.nextDouble();

        double c = (f - 32) * 5 / 9;

        System.out.println(c);
    }
}
