package skillbuilder;

import java.util.Scanner;

public class gradeavg {

    public static void main(String[] args) {

        // declaration
        int Biograde;
        int Mathgrade;
        int Computergrade;
        int Physicsgrade;
        int Chemgrade;
        double avg;
        String rawInput; 

        // User input creation
        Scanner userinput = new Scanner(System.in);

        // Get user input for each grade
        System.out.print("Enter your Biology Grade: ");
        rawInput = userinput.next();
        Biograde = Integer.parseInt(rawInput.replace("%", ""));

        System.out.print("Enter your Math grade: ");
        rawInput = userinput.next();
        Mathgrade = Integer.parseInt(rawInput.replace("%", ""));

        System.out.print("Enter your Computer Science grade: ");
        rawInput = userinput.next();
        Computergrade = Integer.parseInt(rawInput.replace("%", ""));

        System.out.print("Enter your Physics grade: ");
        rawInput = userinput.next();
        Physicsgrade = Integer.parseInt(rawInput.replace("%", ""));

        System.out.print("Enter your Chemistry grade: ");
        rawInput = userinput.next();
        Chemgrade = Integer.parseInt(rawInput.replace("%", ""));

        // Calculate average
        avg = (double) (Biograde + Mathgrade + Computergrade + Physicsgrade + Chemgrade) / 5;

        // Display result
        System.out.println("Your average grade is: " + avg + "%");
        
        
        
        //Jack Nguyen
    }
}