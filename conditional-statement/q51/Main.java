/******************************************************************************

Q51.Write a Java program to check if an entered PIN matches the stored ATM PIN
before allowing withdrawal.
*******************************************************************************/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();

        if(pin == 1234)
            System.out.println("Access Granted");
        else
            System.out.println("Wrong PIN");
    }
}
