/******************************************************************************


Q12.Write a Java Program to print the character for given ASCII value.
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.printf("enter a cahr:");
	    int a=sc.nextInt();
		System.out.println((char) a);
	}
}
