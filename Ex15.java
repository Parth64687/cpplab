import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double sum = num1 + num2;
        double diff = num1 - num2;
        double prod = num1 * num2;
        double div = 0;

        if (num2 != 0) {
            div = num1 / num2;
        } else {
            System.out.println("Warning: Division by zero is not allowed!");
        }

        double mod = 0;
        if (num2 != 0) {
            mod = num1 % num2;
        }

        System.out.println("\n--- Arithmetic Operations ---");
        System.out.println("Addition : " + sum);
        System.out.println("Subtraction : " + diff);
        System.out.println("Multiplication : " + prod);
        
        if (num2 != 0) {
            System.out.println("Division : " + div);
            System.out.println("Modulus : " + mod);
        }
        sc.close();
    }
}