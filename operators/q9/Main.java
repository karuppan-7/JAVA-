/******************************************************************************
Q9.Java Program to print the all digits Except last digit of given number N

*******************************************************************************/
import java.io.*;
public class Main
{
	public static void main(String[] args)throws Exception {
	    BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	    System.out.printf("enter a no:");
	    int a=Integer.parseInt(sc.readLine());
	    int num=a/10;
		System.out.println(num);
	}
}

