/******************************************************************************

Q14.Write a Java Program to print two numbers with a tab space between them..

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.printf("enter num 1:");
	    int a=sc.nextInt();
	    System.out.printf("enter num 2:");
	    int b=sc.nextInt();
		System.out.println(a+"\t"+b);
	}
}
