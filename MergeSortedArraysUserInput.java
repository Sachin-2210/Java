import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArraysUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for first array
        System.out.print("Enter the number of elements in first sorted array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " sorted elements:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Taking input for second array
        System.out.print("Enter the number of elements in second sorted array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " sorted elements:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Merging the arrays
        int[] mergedArray = mergeArrays(arr1, arr2);
        System.out.println("Merged and Sorted Array: " + Arrays.toString(mergedArray));

        scanner.close();
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        // Merge while both arrays have elements
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1 (if any)
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2 (if any)
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }

        return result;
    }
}