/******************************************************************************

Q17.Write a Java Program to print two words in double quotes.

*******************************************************************************/
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter w1:");
        String w1 = sc.next();
        System.out.printf("enter w2:");
        String w2 = sc.next();
        System.out.println("\"" + w1 + " " + w2 + "\"");
    }
}
