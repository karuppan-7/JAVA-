/******************************************************************************
Q22.Write a Java Program to print your marks in 5 subjects each on a new line.

*******************************************************************************/

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter m1 mark");
        int m1 = sc.nextInt();
        System.out.printf("enter m2 mark");
        int m2 = sc.nextInt();
        System.out.printf("enter m3 mark");
        int m3 = sc.nextInt();
        System.out.printf("enter m4 mark");
        int m4 = sc.nextInt();
        System.out.printf("enter m5 mark");
        int m5 = sc.nextInt();
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(m5);
    }
}
