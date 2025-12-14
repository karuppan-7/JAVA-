/******************************************************************************

Q34.Java Program to check whether a given year is a century year or not.

*******************************************************************************/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if(year % 100 == 0)
            System.out.println(year + " is a century year");
        else
            System.out.println(year + " is not a century year");
    }
}

