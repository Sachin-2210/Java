import java.util.Scanner;

public class SachinFrequancy{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String input = sc.nextLine();
        sc.close();

        int[] freq = new int[256]; // Array to store frequency of each character

        for (char ch : input.toCharArray()) {
            freq[ch]++;
        }

        System.out.println("Character frequencies:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " : " + freq[i]);
            }
        }
    }
}