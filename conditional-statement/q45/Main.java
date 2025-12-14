/******************************************************************************

Q45 .Write a Java Program to check whether a person is eligible for senior citizen benefits (age ≥ 60).

*******************************************************************************/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age >= 60)
            System.out.println("Senior Citizen");
        else
            System.out.println("Not a Senior Citizen");
    }
}
