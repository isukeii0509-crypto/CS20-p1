package mastery;

public class Investment {
	 public static void main(String[] args) {
	        double balance = 2500, target = 5000, rate = 0.075;
	        int years = 0;

	        while (balance < target) {
	            balance *= (1 + rate);
	            years++;
	        }

	        System.out.printf("Target met in %d years. Final value: $%.2f%n", years, balance);
	    }
// Jack Nguyen
}

