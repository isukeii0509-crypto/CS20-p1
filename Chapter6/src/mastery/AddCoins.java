package mastery;
import java.util.Scanner;

public class AddCoins {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of pennies: ");
        int pennies = scanner.nextInt();

        System.out.print("Enter number of nickels: ");
        int nickels = scanner.nextInt();

        System.out.print("Enter number of dimes: ");
        int dimes = scanner.nextInt();

        System.out.print("Enter number of quarters: ");
        int quarters = scanner.nextInt();

        String dollarValue = getDollarAmount(pennies, nickels, dimes, quarters);
        System.out.println("Total dollar amount: " + dollarValue);

        scanner.close();
    }

    public static String getDollarAmount(int pennies, int nickels, int dimes, int quarters) {
        int totalCents = (pennies * 1) + (nickels * 5) + (dimes * 10) + (quarters * 25);
        double totalDollars = totalCents / 100.0;
        return String.format("$%.2f", totalDollars);
        
        // Jack Nguyen
    }
}
