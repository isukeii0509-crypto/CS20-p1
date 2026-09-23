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

    	int burgerCount; 
    	int friesCount;
    	int sodasCount;

    	//user input
    	Scanner userinput = new Scanner(System.in);
    	
    	System.out.println("Each burger is $1.69");
    	System.out.println("Each portion of fies is $1.09");
    	System.out.println("Each cup of Soda is $0.99"); 
    	
    	System.out.print("Enter an amount of burgers you'd like to order:");
    	burgerCount = userinput.nextInt();
    	System.out.print("Enter an amount of fries you'd like to order:");
    	friesCount = userinput.nextInt();
    	System.out.print("Enter an amount of sodas you'd like to order:");
    	sodasCount = userinput.nextInt();
    			
    

    	double FoodTotal = (burgerCount * Burgers) + (friesCount * fries) + (sodasCount * sodas);
    	double Totaltax = FoodTotal * tax;
        
    	
    	System.out.printf("Your total before tax: $%.2f%n", FoodTotal);
    	System.out.printf("Tax: $%.2f%n", Totaltax);
    	System.out.printf("Your final cost is: $%.2f%n", (FoodTotal + Totaltax));

    }
}


// Jack Nguyen
    	                                                                                                                     