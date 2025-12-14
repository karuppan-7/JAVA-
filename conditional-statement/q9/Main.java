/******************************************************************************
Q9.Java Program to check odd or even using bitwise operator
*******************************************************************************/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if((n & 1) == 0)
            System.out.println(n + " is Even");
        else
            System.out.println(n + " is Odd");
    }
}
