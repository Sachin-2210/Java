import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] uniqueArr = removeDuplicates(arr);
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArr));

        scanner.close();
    }

    public static int[] removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num); // Adding to Set removes duplicates
        }

        // Convert Set back to array
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        return result;
    }
}