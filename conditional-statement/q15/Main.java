/******************************************************************************

Q15. Java Program to check whether a number is divisible by either 3 or 7
*******************************************************************************/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n % 3 == 0 || n % 7 == 0)
            System.out.println(n + " is divisible by 3 or 7");
        else
            System.out.println(n + " is not divisible by 3 or 7");
    }
}
