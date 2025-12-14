/******************************************************************************

Q16. Java Program to check whether a number is divisible by both 2 and 5 but not by 8.

*******************************************************************************/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n % 2 == 0 && n % 5 == 0 && n % 8 != 0)
            System.out.println(n + " is divisible by 2 and 5 but not by 8");
        else
            System.out.println(n + " does not satisfy the condition");
    }
}
