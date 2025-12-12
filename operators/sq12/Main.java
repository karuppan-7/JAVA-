/******************************************************************************

A product is sold at a loss. Given selling price and loss amount,
the program calculates the cost price using: CP = SP + Loss.

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("SP: ");
        int sp = sc.nextInt();

        System.out.print("Loss: ");
        int loss = sc.nextInt();

        int cp = sp + loss;

        System.out.println("Cost Price: " + cp);
    }
}
