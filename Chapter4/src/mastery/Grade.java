package mastery;
import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        // userinput
        Scanner userinput = new Scanner(System.in);
        
        // Prompt the user for the test percentage
        System.out.print("Enter the test percentage: ");
        double score = userinput.nextDouble();
        
        // Determine the letter grade based on the grading scale
        if (score >= 95) {
            System.out.println("Exemplary (Level 2)");
        } else if (score >= 85) {
            System.out.println("Exemplary (Level 1)");
        } else if (score >= 75) {
            System.out.println("Proficient (Level 2)");
        } else if (score >= 65) {
            System.out.println("Proficient (Level 1)");
        } else if (score >= 55) {
            System.out.println("Developing (Level 2)");
        } else if (score >= 40) {
            System.out.println("Developing (Level 1)");
        } else if (score >= 20) {
            System.out.println("Beginning (Level 2)");
        } else {
            System.out.println("Beginning (Level 1)");
        }
        
       // Jack Nguyen
    }
}