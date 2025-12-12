/******************************************************************************
 
 	
Q20.Write a Java Program to print pass/fail result based on marks.

*******************************************************************************/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        String result = (marks >= 35) ? "Pass" : "Fail";
        System.out.println(result);
    }
}
