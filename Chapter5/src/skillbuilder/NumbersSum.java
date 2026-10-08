package skillbuilder;
import java.util.Scanner;

public class NumbersSum {
    public static void main(String[] args) {
    	Scanner userinput = new Scanner(System.in);
        
        // Prompt the user for an integer
        System.out.print("Enter a positive whole number: ");
        int userNumber = userinput.nextInt();
        
        int sum = 0;
        
        System.out.println("Numbers:");
        for (int i = 1; i <= userNumber; i++) {
            System.out.println(i);
            sum += i; 
        }
        
        // Jack Nguyen
        System.out.println("----------------");
        System.out.println("The sum is: " + sum);
        
    }
}
