package skillbuilder;
import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
      // Scanner for userinput
        Scanner userinput = new Scanner(System.in);
        
        // Prompt the user for an integer
        System.out.print("Enter an integer: ");
        int number = userinput.nextInt();
        
        // Find the square root
        int sqrtInt = (int) Math.sqrt(number);
        int squaredResult = sqrtInt * sqrtInt;
        
        // Check if the squared result equals the original number
        if (squaredResult == number && number >= 0) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
        
        // Jack Nguyen
        
    }
}