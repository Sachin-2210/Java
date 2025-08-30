class A {
    void show(){
        System.out.println("in A Show...");
    }
    
}
// class B extends A {
//     void show(){
//         System.out.println("in B Show...");
//     }
    
// }



public class Anonymous {
    public static void main(String[] args) {
        A obj = new A()
       // This is anomynous class
        {

        void show(){
             System.out.println("in B Show...");
         }

        };
        obj.show();
    }
}
