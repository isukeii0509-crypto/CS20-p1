package mastery;
import java.util.Scanner;

public class Order {
	
    public static void main(String[] args) {
    
    	
    	//declaration
    	double userOrder;
    	double Burgers = 1.69;
    	double fries = 1.09;
    	double sodas = 0.99;
    	double tax = 0.065; // 6.5% tax
    	
    	//user input
    	Scanner userinput = new Scanner(System.in);
    	
    	System.out.println("Each burger is $1.69");
    	System.out.println("Each portion of fies is $1.09");
    	System.out.println("Each cup of Soda is $0.99"); 
    	
    	System.out.print("Enter an amount of burgers you'd like to order:");
    	userOrder = userinput.nextDouble();
    	System.out.println("Enter an amount of fries you'd like to order:");
    	userOrder = userinput.nextDouble();
    	System.out.println("Enter an amount of sodas you'd like to order:");
    	userOrder = userinput.nextDouble();
    			
    

    			
    	double Totaltax = userOrder * tax;
        
    	
    	System.out.println("Your total before tax:" + userOrder);
    	System.out.print("Tax:" + Totaltax);
    	System.out.print("Your final cost is:" + Totaltax + userOrder);
    }
}


// Jack Nguyen
    	                                                                                                                     