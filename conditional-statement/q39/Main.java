/******************************************************************************

Q39.Java Program to check grade of a student based on marks (A, B, Java, Fail)
*******************************************************************************/
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter marks: ");
        int marks = sc.nextInt();
        if (marks >= 80 && marks <= 100) {
            System.out.println("grade: Fail");
        } else if (marks >= 60) {
            System.out.println("grade: c");
        } else if (marks >= 35) {
            System.out.println("grade: b");
        } else {
            System.out.println("grade: a");
        }
    }
}
