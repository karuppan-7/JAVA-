/******************************************************************************

Q31. Write a Java Program to check whether four sides form a square or rectangle..

*******************************************************************************/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter four sides: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if(a == b && b == c && c == d)
            System.out.println("Square");
        else if(a == c && b == d)
            System.out.println("Rectangle");
        else
            System.out.println("Neither square nor rectangle");
    }
}
