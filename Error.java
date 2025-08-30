public class Error {
    public static void main(String[] args) {
        int i = 0;
        int j = 10;
        int arr[] = new int [5];
      try{
       int  b = j/i; 
       System.out.println(b);
       System.out.println(arr[1]);
       System.out.println(arr[5]);
      }
      catch(ArithmeticException e){
        System.err.println("Some thing went wrong...");
      }
      catch(ArrayIndexOutOfBoundsException e){
        System.err.println("Array is out of bound..");
      }
        System.out.println(j);
        System.err.println("Sachin yadav");
    }
}
