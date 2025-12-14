/******************************************************************************

Q27. Java Program to check whether a triangle is right-angled or not

*******************************************************************************/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sides a, b, c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(a, Math.max(b, c));
        int sumSquares = a*a + b*b + c*c - max*max;
        if(max*max == sumSquares)
            System.out.println("Right-angled triangle");
        else
            System.out.println("Not a right-angled triangle");
    }
}

