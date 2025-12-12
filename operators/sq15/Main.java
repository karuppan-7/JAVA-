/******************************************************************************

An ATM dispenses money in ₹2000, ₹500, and ₹100 notes.
For a given amount, calculate the number of each note required 
(highest denomination first).
*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        int amt = sc.nextInt();

        int n500 = amt / 500;
        amt %= 500;

        int n100 = amt / 100;

        System.out.println("500 Notes: " + n500);
        System.out.println("100 Notes: " + n100);
    }
}
