package skillbuilder;
import java.util.Scanner;

public class SpanishNumbers
{

public static void main(String[] args) { 
	for (int i = 1; i <= 10; i++) {
		displaySpanishNumber(i);
		
	}
	}
	public static void displaySpanishNumber(int number) {
		
		String[] spanishwords = {
				"uno", "dos", "tres", "cuatro", "cinco", "seis", "seite", "ocho", "nueve", "diez"
		};
		if (number >=1 && number <= 10) {
			
			
			System.out.println(number + " in Spanish is " + spanishwords[number - 1]);
			
		}
		else {
			System.out.println("Invalid action");
					
			}
		}
	{
		
	}
}
