import java.util.Scanner;

public class Sachin{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string or number: ");
        String input = scanner.nextLine();
         scanner.close();
         
         if(Titu(input)){
            System.out.println("IT is a palindrome no : " );
         }
         else
         System.out.println("is not a palindrome no");
            
    }

    public static boolean  Titu(String str){
        int left = 0 , right = str.length()-1;

        while (left< right){
            if (str.charAt(left) != str.charAt(right)){
                return false ;
            }
            left ++ ;
            right -- ;
        }
         return true;
    }
}