/******************************************************************************

Q18.Write a Java Program to print whether a number is positive or negative.


*******************************************************************************/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String result = (num >= 0) ? "Positive" : "Negative";
        System.out.println(result);
    }
}
