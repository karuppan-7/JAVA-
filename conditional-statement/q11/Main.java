/******************************************************************************

Q11. Java Program to check whether the first digit of a 3 digit number is odd or even

*******************************************************************************/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int n = sc.nextInt();
        int firstDigit = n / 100;
        if(firstDigit % 2 == 0)
            System.out.println("First digit is Even");
        else
            System.out.println("First digit is Odd");
    }
}
