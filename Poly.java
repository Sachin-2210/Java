class A{
    void show(){
    System.out.println("in A ");
    }
}
class B extends A{
    void show(){
    System.out.println("in B ");
    }
}
class C extends A{
    void show(){
    System.out.println("in C ");
    }
}

    public class Poly {
    public static void main(String[] args) {

        A obj = new A();
        obj.show();

        // B obj = new B();
        // obj.show();

        // C obj = new C();
        // obj.show();

        // A obj = new B();
        // obj.show();

        // A obj = new C();
        // obj.show();

        obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();


        
    }
    
}
