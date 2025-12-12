/******************************************************************************

Q17.Write a Java Program to check if a number is power of 2 using bitwise AND.

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPowerOfTwo = (num > 0) && ((num & (num - 1)) == 0);
        System.out.println(isPowerOfTwo);
    }
}

