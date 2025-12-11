/******************************************************************************

Q7.Write a Java Program to print given integer number in Hexadecimal format.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.printf("enter a number:");
	    int a=sc.nextInt();
		System.out.printf("%x",a);
	}
}
