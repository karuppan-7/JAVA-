/******************************************************************************
Q12.Write a Java Program to print the absolute value of a given number.
*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = sc.nextInt();
        int absvalue = (num >= 0) ? num : -num;
        System.out.println("value: " + absvalue);
    }
}

