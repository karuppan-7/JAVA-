/******************************************************************************

A teacher distributes candies equally among students. 
The program finds how many candies each student gets and how many remain undistributed.

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Candies: ");
        int candies = sc.nextInt();

        System.out.print("Students: ");
        int students = sc.nextInt();

        int each = candies / students;
        int remain = candies % students;

        System.out.println("Each Gets: " + each);
        System.out.println("Remaining: " + remain);
    }
}
