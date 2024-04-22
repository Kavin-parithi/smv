public class Primechecker {
    
    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        // If number is less than 2, it's not prime
        if (n <= 1) {
            return false;
        }
        // Check for divisibility from 2 to square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                // If divisible by any number, it's not prime
                return false;
            }
        }
        // If not divisible by any number, it's prime
        return true;
    }
    
    // Main method to test the function
    public static void main(String[] args) {
        int number = 29; // Change the number to test here
        
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
