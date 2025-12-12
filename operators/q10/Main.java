/******************************************************************************

Q10.Write a Java Program to print the sum of the first and last digit of a 3-digit number.

*******************************************************************************/
import java.io.*;
public class Main
{
	public static void main(String[] args)throws Exception {
	    BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	    System.out.printf("enter a no:");
	    int a=Integer.parseInt(sc.readLine());
	    int frst=a%10;
	    int scnd=a/1000;
	    int num=frst+scnd;
		System.out.println(num);
	}
}
