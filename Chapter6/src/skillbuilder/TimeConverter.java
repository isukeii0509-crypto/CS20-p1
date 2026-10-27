package skillbuilder;
import java.util.Scanner;

public class TimeConverter {

    public static double convertHoursToMinutes(double hours) { 
        return hours * 60; 
    } 
    
    public static double convertDaystoHours(double days) { 
        return days * 24; 
    } 
    
    public static double convertMinutestoHours(double minutes) { 
        return minutes / 60; 
    } 
    
    public static double convertHourstoDays(double hours) { 
        return hours / 24; 
    } 

    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Please choose an option"); 
        System.out.println("1.convert hours to minutes"); 
        System.out.println("2. Convert days to hours"); 
        System.out.println("3. convert minutes to hours"); 
        System.out.println("4. Convert hours to days"); 
        System.out.print("Please pick between option 1 - 4: "); 
        
        
        int choice = input.nextInt(); 
        double inputValue = input.nextDouble(); 
        double convertedValue = 0; 

        System.out.println(); 

        switch (choice) {
            case 1:
                convertedValue = convertHoursToMinutes(inputValue);
                System.out.println(inputValue + " hours is " + convertedValue + " minutes.");
                break;
            case 2:
                convertedValue = convertDaystoHours(inputValue);
                System.out.println(inputValue + " days is " + convertedValue + " hours.");
                break;
            case 3:
                convertedValue = convertMinutestoHours(inputValue);
                System.out.println(inputValue + " minutes is " + convertedValue + " hours.");
                break;
            case 4:
                convertedValue = convertHourstoDays(inputValue);
                System.out.println(inputValue + " hours is " + convertedValue + " days.");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        // Jack Nguyen

        input.close();
    }
}
