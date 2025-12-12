/******************************************************************************

Three friends eat at a restaurant and get a single bill. 
They want to split the total bill equally. 
The program calculates how much each friend must pay.

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Total Bill: ");
        double bill = sc.nextDouble();

        double each = bill / 3;

        System.out.println("Each Friend Pays: " + each);
    }
}
