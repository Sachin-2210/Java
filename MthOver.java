

class A{
   public int add(int n1, int n2){
      return n1 + n2;
   } 
}

class B extends A{
    public int add(int n1, int n2){
        return n1+n2+5;
    }
}


public class MthOver {
    public static void main(String a[]){
        B obj = new B();
       int s1=  obj.add(5,2);
        System.out.println(s1);
    }
    
}
