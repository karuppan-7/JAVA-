/******************************************************************************

Q18.Write a Java Program to print your date of birth in the format DD/MM/YYYY.

*******************************************************************************/
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter your dob:");
        String dob = sc.next();
        System.out.println(dob);
    }
}

