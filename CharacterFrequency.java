import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }


        System.out.println("Character Frequencies:");
        for (char ch : frequencyMap.keySet()) {
            System.out.println(ch + ": " + frequencyMap.get(ch));
        }
    }
}