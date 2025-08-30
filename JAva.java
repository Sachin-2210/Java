import  java.util.Scanner;

public class JAva{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of Term :");
        int n = scanner.nextInt();
        scanner.close();

        int first = 0 , second = 1;
        for(int i = 0 ; i < n ; i++){
          System.out.print(first + " ");
          int next = first + second;
          first = second; 
          second = next;
        }
        
    }
}