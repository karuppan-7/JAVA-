/******************************************************************************

Q23. Java Program to check whether a character is alphabet or not

*******************************************************************************/
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
            System.out.println(ch + " is an alphabet");
        else
            System.out.println(ch + " is not an alphabet");
    }
}
