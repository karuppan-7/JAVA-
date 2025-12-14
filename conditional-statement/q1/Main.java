/******************************************************************************
Q1.Java Program to find greatest among two numbers
*******************************************************************************/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("Greatest: " + a);
        } else {
            System.out.println("Greatest: " + b);
        }
    }
}
