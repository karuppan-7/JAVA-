/******************************************************************************

Q13. Write a Java Program to print the square of a given number

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int square = num * num * num;
        System.out.println("Square: " + square);
    }
}
