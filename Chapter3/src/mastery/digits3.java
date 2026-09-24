package mastery;

import java.util.Scanner;

public class digits3 {

    public static void main(String[] args) {

        // declaration
	        double userNumber;
	        int number;  int hundreds; int tens; int ones;

        // User input creation
        Scanner userinput = new Scanner (System.in);
        
        System.out.print("Enter a three digit number:");
        
        // Get user input as a double
        userNumber = userinput.nextDouble();

        //double -> int 
        number = (int) userNumber;

        // Extract digits
        hundreds = number / 100;
        tens = (number / 10) % 10;
        ones = number % 10;

        System.out.println("Hundreds digit: " + hundreds);
        System.out.println("Tens digit: " + tens);
        System.out.println("Ones digit: " + ones);
        
                // Jack Nguyen
    }
}