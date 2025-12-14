/******************************************************************************

Q35.Java Program to check whether the first two digits and last two digits of a year are equal.

*******************************************************************************/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        int firstTwo = year / 100;
        int lastTwo = year % 100;
        if(firstTwo == lastTwo)
            System.out.println("First two digits and last two digits are equal");
        else
            System.out.println("First two digits and last two digits are not equal");
    }
}
