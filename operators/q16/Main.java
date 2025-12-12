/******************************************************************************

Q16.Write a Java Program to check whether two numbers are equal True if equal else False.


*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1 number: ");
        int num1 = sc.nextInt();
        System.out.print("enter num2 number: ");
        int num2 = sc.nextInt();
        boolean a= (num1 == num2); 
        System.out.println(a);
    }
}
