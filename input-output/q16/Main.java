/******************************************************************************

Q16.Write a Java Program to print a character in single quotes.
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.printf("enter a char:");
	    char a=sc.next().charAt(0);
		System.out.println("'"+a+"'");
	}
}