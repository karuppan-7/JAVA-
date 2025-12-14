/******************************************************************************

Q8.Java Program to find whether the last digit of given number is divisible by 3

*******************************************************************************/
import java.util.Scanner;
public class  Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int lastDigit = n % 10;
        if(lastDigit % 3 == 0)
            System.out.println("Last digit is divisible by 3");
        else
            System.out.println("Last digit is not divisible by 3");
    }
}

