/******************************************************************************

Q43.Write a Java Program to calculate different discount for different Bill amount
*******************************************************************************/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bill = sc.nextDouble();

        if(bill >= 5000)
            System.out.println("Discount: 20%");
        else if(bill >= 2000)
            System.out.println("Discount: 10%");
        else
            System.out.println("No Discount");
    }
}
