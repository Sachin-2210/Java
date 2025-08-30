import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string or number: ");
        String input = scanner.nextLine();
        
        if (isPalindrome(input)) {
            System.out.println("It is a palindrome!");
        } else {
            System.out.println("Not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Mismatch found, not a palindrome
            }
            left++;
            right--;
        }
        return true; // All characters match
    }
}