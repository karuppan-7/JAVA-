/******************************************************************************
Q7.Write a Java Program to Swap of two numbers without using third variable

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int a = sc.nextInt();
        System.out.print("Enter number b: ");
        int b = sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

