abstract class A{
    void car(){
        System.out.println("In class A");
    }
}
class B extends A{
    void car(){
        System.out.println("In class B");
    }
}

public class Abst{
    public static void main(String[] args) {

       A obj = new B();
       obj.car();


    }   
}