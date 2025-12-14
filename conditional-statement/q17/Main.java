/******************************************************************************

Q17. Java Program to check whether two numbers have the same last digit

*******************************************************************************/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        if(a % 10 == b % 10)
            System.out.println("Both numbers have the same last digit");
        else
            System.out.println("Last digits are different");
    }
}
