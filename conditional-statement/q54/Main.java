/******************************************************************************

Q54.Write a Java program to apply discount based on purchase amount.
*******************************************************************************/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        if(amount >= 5000)
            System.out.println("Discount Applied");
        else
            System.out.println("No Discount");
    }
}
