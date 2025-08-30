import java.util.*;

public class Sachin{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no a : ");
        int a = sc.nextInt();
        System.out.print("Enter no b : ");
        int b = sc.nextInt();
       
       int temp = a;
        a=b;
        b=temp;
        System.out.println(" no a : "+a);
        System.out.println(" no b : "+b);
    }
}