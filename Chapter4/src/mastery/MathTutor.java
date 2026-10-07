package mastery;
import java.util.Scanner;

public class MathTutor {
	public static void main(String[] args) {
		
		// userinput
		Scanner userinput = new Scanner(System.in);
		
		//declarations
		int  randomnum1;
		int randomnum2;
		int operatornum;
		char operator = ' ';
		int correctanswer = 0;
		
		//generate two random numbers from 1-10
		randomnum1 = (int) (Math.random() * 10) + 1;
		randomnum2 = (int) (Math.random() * 10) + 1;
		
		//randomly choose an operation
		operatornum = (int) (Math.random() * 4) + 1;
		
		if (operatornum == 1) {
			operator = '+';
			correctanswer = randomnum1 + randomnum2;
		}
		else if (operatornum == 2) {
			operator = '-';
			correctanswer = randomnum1 - randomnum2;
		}
		else if (operatornum ==3) {
			operator = '*';
			correctanswer = randomnum1 * randomnum2;
		}
		else if (operatornum == 4) {
			operator = '/';
			correctanswer = randomnum1 / randomnum2;
		
		//prompts user for answer
		System.out.print("What is " + randomnum1 + " " + operator + " " + randomnum2 + "? ");
         int userAnswer = userinput.nextInt();
		// Check the answer and display message
		if (userAnswer == correctanswer) {
			System.out.println("Correct!");
		} else {
			System.out.println("Incorrect. The correct answer is " + correctanswer + ".");
		}
		// Jack Nguyen 
		}
	}
}
		
		
	

