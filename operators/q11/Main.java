/******************************************************************************

Q11.Write a Java Program to print the middle digit of a 3-digit number.

*******************************************************************************/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();
        int middleDigit = (num / 10) % 10;
        System.out.println("middle digit: " + middleDigit);
    }
}
