import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);

        scanner.close();
    }

    public static long factorial(int n) {
        if ( n == 1) {
            return 1; // Base case
        }
        return n * factorial(n - 1); // Recursive step
    }
}