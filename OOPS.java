class add{
    public int sum(){
        int a = 10 ;
        System.out.println(a);
        return 0;

    }
}
    public class OOPS {
    public static void main(String a[]){
        int n = 11;
        int m = 12;
     //this liine is object
        add calc = new add();

        calc.sum();
        int  sum = n+m;
        System.out.println(sum);
        int result = calc.sum();
    }
    
}
