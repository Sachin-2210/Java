enum Sachin{
    January , Febraury, March , April , May, June, July , August , September , October , November , December;
}



public class TestEnum {
    public static void main(String a[]){
       Sachin s= Sachin.January;
       switch (s) {
        case January:
            System.out.println("MONTH 1");
         break;
        case Febraury:
            System.out.println("MONTH 2");
         break;
        case March:
            System.out.println("MONTH 3");
         break;
        case April:
            System.out.println("MONTH 4");
         break;
        case May:
            System.out.println("MONTH 5");
         break;
        case June:
            System.out.println("MONTH 6");
         break;
        case July:
            System.out.println("MONTH 7");
         break;
        case August:
            System.out.println("MONTH 8");
         break;
        case September:
            System.out.println("MONTH 9");
         break;
        case October:
            System.out.println("MONTH 10");
         break;
        case November:
            System.out.println("MONTH 11");
         break;
    
        default:
        System.out.println("MONTH 12");
            break;
    }

        
        }

    }
