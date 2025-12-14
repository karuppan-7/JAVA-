/******************************************************************************

Q37.Write a Java Program to check whether a given year and month combination is valid and print the number of days in that month (consider leap years for February).

*******************************************************************************/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        int days = 0;

        if(month == 2)
            days = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28;
        else if(month == 4 || month == 6 || month == 9 || month == 11)
            days = 30;
        else if(month >= 1 && month <= 12)
            days = 31;
        else {
            System.out.println("Invalid month");
            return;
        }

        System.out.println("Number of days: " + days);
    }
}

