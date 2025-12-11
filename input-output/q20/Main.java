/******************************************************************************

Q20.Write a Java Program to print the size of char, int, float and double.

*******************************************************************************/
class Main {
    public static void main(String[] args) {
        System.out.println("char: " + Character.BYTES + " bytes");
        System.out.println("int: " + Integer.BYTES + " bytes");
        System.out.println("float: " + Float.BYTES + " bytes");
        System.out.println("double: " + Double.BYTES + " bytes");
    }
}
