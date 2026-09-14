package skillbuilder;

import java.util.Scanner;

public class digits {

	public static void main(String[] args) 
	{
		//declaration
		int i;
		double d;
		int x;

		//User input creation
		 Scanner userinput = new Scanner (System.in);
		 
		 //Get user input for int
		 System.out.print("Enter integer: ");
		 i = userinput.nextInt();
		 
		 //Get user input for double
		 System.out.print("Enter double: ");
		 d = userinput.nextInt();

		x= i * (int)d ;
		System.out.println
		System.out.println("Your digits are: " + x);
	}
	}