package mastery;

public class PerfectIntegers {

    public static void main(String[] args) {
        System.out.println("Perfect numbers up to 100:");
        
        // Loop through numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
    }

    
    public static boolean isPerfect(int number) {

    	if (number <= 1) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i; 
            }
        }

        return sum == number;
        // Jack Nguyen
    }
}
