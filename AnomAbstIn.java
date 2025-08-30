abstract class A{
   abstract void show();
   abstract void config();

}

public class AnomAbstIn {
    public static void main(String a[]){

        A obj = new B()
        {
            void show(){
                System.out.println("In B show..");
            }
            void config(){
                System.out.println("in B config");
            }
        };
        obj.show();
        obj.config();

    }
}
