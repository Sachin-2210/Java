import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        scanner.close();

        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println("Reversed String: " + reversed);
    }
}