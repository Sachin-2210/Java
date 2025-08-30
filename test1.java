import java.util.Scanner;

public class test1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your n :  ");
        int n= scanner.nextInt();
           if(n%7==0){
               System.out.println("perfectly divisible");
           }
           System.out.println("NOT DIVISIBLE");
    }
           
    }