package skillbuilder;

import java.util.Scanner;

public class Exponentiation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Exponentiation Application");

        // Prompt user for the base number
        System.out.print("Enter the first number (base): ");
        double base = scanner.nextDouble();

        // Prompt user for the exponent number
        System.out.print("Enter the second number (exponent): ");
        double exponent = scanner.nextDouble();

        double result = powerOf(base, exponent);

        // Display the final result
        System.out.println("\nResult: " + base + " raised to the power of " + exponent + " is " + result);

        scanner.close();
    }

   
    public static double powerOf(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
