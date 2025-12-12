/******************************************************************************

A shop offers festival discounts. The customer enters the original price and discount percentage. 
The program must calculate the discount amount and the final price payable after applying the discount.

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Original Price: ");
        double price = sc.nextDouble();

        System.out.print("Discount: ");
        double dis = sc.nextDouble();

        double discountAmount = price * dis / 100;
        double finalPrice = price - discountAmount;

        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Price: " + finalPrice);
    }
}
