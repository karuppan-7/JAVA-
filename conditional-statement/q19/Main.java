/******************************************************************************

Q19. Java Program to check whether the product of two numbers is positive or negative

*******************************************************************************/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int product = a * b;
        if(product > 0)
            System.out.println("Product is Positive");
        else if(product < 0)
            System.out.println("Product is Negative");
        else
            System.out.println("Product is Zero");
    }
}
