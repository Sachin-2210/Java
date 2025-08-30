
interface A{

    public int age = 44;    // by default variable are finalor static thats why we have to asssign value
    public String Ball= "Sachin";
     void name();
     void Surname();

}

class B implements A{

   
    public void name() {
        System.out.println("in Name .");
    }

    public void Surname() {
        System.out.println("IN Surname.");
    }

}



public class InterfaceCode {
    public static void main(String a[]){
        A obj;
        obj = new B();
        obj.name();
        obj.Surname();

        System.out.println(A.age);
        System.out.println(A.Ball);

    } 
}
