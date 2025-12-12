/******************************************************************************
A company calculates employee salary using: Basic + HRA + Allowance. 
The program must compute the total salary.
*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Basic: ");
        int basic = sc.nextInt();

        System.out.print("HRA: ");
        int hra = sc.nextInt();

        System.out.print("Allowance: ");
        int alw = sc.nextInt();

        int total = basic + hra + alw;

        System.out.println("Total Salary: " + total);
    }
}
