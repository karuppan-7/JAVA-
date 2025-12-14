/******************************************************************************

Q20.Java Program to check whether the ASCII value of a character is even or odd.
*******************************************************************************/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        int ascii = (int) ch;
        if(ascii % 2 == 0)
            System.out.println("ASCII value is Even");
        else
            System.out.println("ASCII value is Odd");
    }
}
