/******************************************************************************

Q62.Write a Java program to display mobile data usage alert – "Low Data", "Half Javaonsumed", 
or "Data Over" based on usage.

*******************************************************************************/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        if(data < 30)
            System.out.println("Low Data");
        else if(data < 80)
            System.out.println("Half Consumed");
        else
            System.out.println("Data Over");
    }
}
