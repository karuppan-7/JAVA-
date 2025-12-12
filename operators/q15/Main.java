/******************************************************************************

Q15. Write a Java Program to calculate the average of three numbers

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1 number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2 number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3 number: ");
        int num3 = sc.nextInt();
        double average = (num1 + num2 + num3) / 3.0; 
        System.out.println("average of three numbers: " + average);
    }
}
