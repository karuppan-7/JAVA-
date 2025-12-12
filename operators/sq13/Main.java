/******************************************************************************

A fruit shop has an offer: Buy 3 mangoes and get 1 free.
Based on the mango price and total mangoes purchased, 
compute total mangoes received and amount to pay.
*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Mango Price: ");
        int price = sc.nextInt();

        System.out.print("Buy: ");
        int buy = sc.nextInt();

        int free = buy / 3;         
        int totalMangoes = buy + free;
        int amount = buy * price;

        System.out.println("Total Mangoes: " + totalMangoes);
        System.out.println("Amount: " + amount);
    }
}
