package skillbuilder;
import java.util.Scanner;

public class Randomnum {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        
        // Get input from user
        System.out.print("Enter the minimum value: ");
        int min = userinput.nextInt();
        
        System.out.print("Enter the maximum value: ");
        int max = userinput.nextInt();
        
        if (min > max) {
            System.out.println("Error: The minimum value cannot be greater than the maximum value.");
        } else {
            
        	int randomNum = (int) (Math.random() * ((max - min) + 1)) + min;
            
            // Display the result
            System.out.println("The random number between " + min + " and " + max + " is: " + randomNum);
        }
        // Jack Nguyen
    }
}