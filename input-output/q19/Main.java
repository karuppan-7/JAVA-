/******************************************************************************

Q19.Write a Java Program to print an integer with a plus sign (+) before it.

*******************************************************************************/
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter an number:");
        int num = sc.nextInt();
        System.out.printf("+%d", num);
    }
}

