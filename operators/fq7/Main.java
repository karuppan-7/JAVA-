/******************************************************************************

Q7.Write a Java Program to calculate Javaelsius to Fahrenheit
*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double c = sc.nextDouble();

        double f = (c * 9 / 5) + 32;

        System.out.println(f);
    }
}
