/******************************************************************************
Q6.Write a Java Program to Swap two numbers using third variable

*******************************************************************************/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number a: ");
        int a = sc.nextInt();
        System.out.print("enter number b: ");
        int b = sc.nextInt();
        int temp = a;  
        a = b;
        b = temp;
        System.out.println("swaped number:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
