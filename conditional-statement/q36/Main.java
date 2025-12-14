/******************************************************************************

Q36.Java Program to check whether two given years have the same last digit..

*******************************************************************************/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first year: ");
        int year1 = sc.nextInt();
        System.out.print("Enter second year: ");
        int year2 = sc.nextInt();
        if(year1 % 10 == year2 % 10)
            System.out.println("Both years have the same last digit");
        else
            System.out.println("Last digits are different");
    }
}
