/******************************************************************************
Q25.Write a Java Program to print your address in multiple lines using \n.

*******************************************************************************/
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter line 1:");
        String l1 = sc.nextLine();
        System.out.printf("enter line 2:");
        String l2 = sc.nextLine();
        System.out.printf("enter line 3:");
        String l3 = sc.nextLine();
        System.out.println(l1 + "\n" + l2 + "\n" + l3);
    }
}
