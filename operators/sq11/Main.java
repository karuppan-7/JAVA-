/******************************************************************************
A shopkeeper sells an item at a profit. Given cost price and profit, calculate the selling price using: 
SP = CP + Profit.

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("CP: ");
        int cp = sc.nextInt();

        System.out.print("Profit: ");
        int profit = sc.nextInt();

        int sp = cp + profit;

        System.out.println("Selling Price: " + sp);
    }
}
