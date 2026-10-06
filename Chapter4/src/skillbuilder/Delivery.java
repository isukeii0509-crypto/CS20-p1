package skillbuilder;
import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        // userinput
        Scanner userinput = new Scanner(System.in);
        
        // Ask user for length, width and height
        System.out.print("Enter the length of the package: ");
        double length = userinput.nextDouble();
        
        System.out.print("Enter the width of the package: ");
        double width = userinput.nextDouble();
        
        System.out.print("Enter the height of the package: ");
        double height = userinput.nextDouble();
        
        // Check if ANY dimension is greater than 10
        if (length > 10 || width > 10 || height > 10) {
            System.out.println("reject");
        } else {
            System.out.println("Accept");
        }
        

        // Jack Nguyen
    }
}	