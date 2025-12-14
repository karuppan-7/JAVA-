/******************************************************************************

Q18. Java Program to check whether a number is a single-digit, two-digit, or three-digit number
*******************************************************************************/
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n >= 0 && n <= 9)
            System.out.println("Single-digit number");
        else if(n >= 10 && n <= 99)
            System.out.println("Two-digit number");
        else if(n >= 100 && n <= 999)
            System.out.println("Three-digit number");
        else
            System.out.println("Number has more than three digits");
    }
}
