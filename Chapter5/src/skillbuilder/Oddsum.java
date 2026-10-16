package skillbuilder;
import java.util.Scanner;

public class Oddsum {
	public static void main(String[] args) {
    	Scanner userinput = new Scanner(System.in);    	
        System.out.print("Enter a number: ");
        int limit = userinput.nextInt();
        
        System.out.println("Odd numbers between 1 and " + limit + " are:");
        for (int i = 1; i <= limit; i += 2) {
            System.out.print(i + " ");
        }
        
        // Jack Nguyen
    }
		 
	 }
