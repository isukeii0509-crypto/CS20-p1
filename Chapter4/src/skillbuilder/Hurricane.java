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
    		System.out.print("Category 1 Hurrycane");
    		System.out.print("MPH: 74-95");
    		System.out.print("61-82 kts");
    		System.out.print("119-153 km/hr");
    		
    	}


}
}