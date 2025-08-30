class A{
    int age;

    void show(){
        System.out.println("In Showw...");
    }
    
    // we can also use static class then we have to make obj = new A.B();
    class B{
        
         void config(){

          System.out.println("In Config...");
        }

    }
}



public class InnClass {
    public static void main(String a[]){
     
        A obj = new A();
        obj.show();
        A.B obj1 = obj.new B();
        obj1.config();
    }

    
}
