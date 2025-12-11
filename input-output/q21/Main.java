/******************************************************************************

Q21.Write a Java Program to print your roll number and name in the format: Roll No: 123, Name: John
*******************************************************************************/
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter rool no:");
        String rool = sc.next();
        System.out.printf("enter Name:");
        String name = sc.next();
        System.out.println("rool no: " + rool + ", name: " + name);
    }
}

