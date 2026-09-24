package skillbuilder;
import java.util.Scanner;


public class Hurricane {
    public static void main(String[] args) {
    	Scanner userinput = new Scanner (System.in);
    	
    	//declaration
    	int category;
    	
    	//Get input from user
    	System.out.print("Enter the Saffir-Simpson hurrican category from 1-5: ");
    	category = userinput.nextInt();
    	
    	// checking category
    	if (category ==1 ) {
    		System.out.println("Category 1 Hurricane");
    		System.out.println("MPH: 74-95");
    		System.out.println("61-82 kt");
    		System.out.println("119-153 km/hr");
    		
    	}
    	else if (category ==2) {
    		System.out.println("Category 2 Hurricane");
    		System.out.println("MPH: 96-110");
    		System.out.println("83-95 kt");
    		System.out.println("154-177 km/hr");
    	}


}
}