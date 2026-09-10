package skillbuilder;

import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) 
	{
		
	//Declaration 
	 int length; 
	 int width; 
	
	 //create scanner object from
	 Scanner userinput = new Scanner (System.in);
	 
	 //Get user input from keyboard
	 System.out.print("Enter width: ");
	 width = userinput.nextInt();
	 
	//Get user input from keyboard
		 System.out.print("Enter length: ");
		 length = userinput.nextInt();
		 
	//Display the length and the width
	System.out.println("The length is:" + length);
	System.out.print("The width is:" + width);
	}
    
}
