class Bank{
    float interest(){
        return 0;
    }
}
class Sbi extends Bank{
    float interest(){
      return 8.4f;
    }
}
class Icici extends Bank{
    float interest(){
        return 7.3f;
    }
}
class Axis extends Bank{
     float interest(){
       return 9.7f;
    }
}


public class BankPoly {
    public static void main(String a[]){

        Bank b;
        b = new Sbi();
        System.out.println("The Interest of SBI : "+ b.interest());

        b = new Icici();
        System.out.println("The Interest of ICICI: "+ b.interest());

        b = new Axis();
        System.out.println("The Interest of AXIS: "+ b.interest());
    }
}
