/******************************************************************************

A stationery shop offers: Buy 5 pens, pay only for 3. Given price per pen and pens bought, 
the program calculates how many pens need to be paid for and total cost.

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Pen Price: ");
        int price = sc.nextInt();

        System.out.print("Buy: ");
        int buy = sc.nextInt();

        int offerSets = buy / 5;       
        int remaining = buy % 5;      
        int payFor = (offerSets * 3) + remaining;
        int amount = payFor * price;

        System.out.println("Pay For: " + payFor);
        System.out.println("Total Amount: " + amount);
    }
}

