enum Status{
    Running,Sachin,Ram,IYGD;
}


public class Enum10 {
    public static void main(String a[]){
        Status s = Status.Sachin;
     
        switch (s) {
            case Running:
                System.out.println("All Good");
             break;
            case Ram:
                System.out.println("Please Wait");
             break;
            case Sachin:
                System.out.println("Try Again");
             break;
        
            default:
            System.out.println("Done");
                break;
        }





        // we can also use if , else if and else
        // if(s == Status.Running)
        //    System.out.println("All Good");
        // else if(s==Status.Sachin)
        //    System.out.print("Try Again");
        // else if( s==Status.Ram )
        //    System.out.print("Please Wait");  
        // else 
        //    System.out.print("Done");  

    }
    
}
