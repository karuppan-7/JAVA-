/******************************************************************************

Q38.Java Program to Arithmetic Calculator using switch case Statements

*******************************************************************************/
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("enter second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Choose an operation:");
        System.out.println("1. addition");
        System.out.println("2. subtraction");
        System.out.println("3. multiplication");
        System.out.println("4. division");
        System.out.print("enter your choice 1-4: ");
        int choice = sc.nextInt();
        double result;
        switch(choice) {
            case 1:
                result = num1 + num2;
                System.out.println("result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("result: " + result);
                } else {
                    System.out.println("error: cant dived by 0.");
                }
                break;
            default:
                System.out.println("Invalid choice choose thr number 1-4.");
        }

       
    }
}
