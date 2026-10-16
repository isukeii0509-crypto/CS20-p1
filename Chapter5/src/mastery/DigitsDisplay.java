package mastery;
import java.util.Scanner;
public class DigitsDisplay {

	    public static void main(String[] args) {
	        Scanner userinput = new Scanner(System.in);

	        // Prompt the user for a non-negative integer
	        System.out.print("Enter a non-negative integer: ");
	        int number = userinput.nextInt();

	        String numberStr = String.valueOf(number);

	        System.out.println("Digits:");
	        for (int i = 0; i < numberStr.length(); i++) {
	            System.out.println(numberStr.charAt(i));
	        }

	        // Jack Nguyen
	    }
	}


