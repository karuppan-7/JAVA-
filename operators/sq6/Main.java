/******************************************************************************
A computer networks student wants to convert bytes into bits. Since 1 byte = 8 bits,
the program multiplies accordingly.
*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bytes: ");
        int bytes = sc.nextInt();

        int bits = bytes * 8;

        System.out.println("Bits: " + bits);
    }
}
