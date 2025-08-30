class A{
    int id,no;
    String surname;
    public void id(){
        System.out.println("ID NO : " + id);
    }
}

class B extends A{
    public void name(){
        System.out.println("NAME IS :" + surname );
    }
}
class C extends B{
    String name;
    public void number(){
        System.out.println("NO IS :" + no);
    }
}

public class MultiInheritance {
    public static void main(String  a[]){
        C obj = new C();
        obj.id = 10;
        obj.surname = "Sachin";
        obj.no= 941566;
        obj.id();
        obj.name();
        obj.number();
    }
    
}
