

class A{
    public A(){
        super();
        System.out.println("in class A");
    }
    public A(int n){
        super();
        System.out.println("in class Aa");
    }
}

class B extends A{
    public B(){
        super();
        System.out.println("in class B");
    }
    public B(int n){
        this();
        System.out.println("in class Ba");  
    }
}

public class ThisSuper{
    public static void main(String a[]){
     B obj = new B( 5);
    }
}