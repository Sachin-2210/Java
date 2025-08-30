public class overloading{
    int id ;
    int age;
    String name;

    public overloading(int a , String n){
        age = a;
        name = n;
    }
    public overloading(int a , String n,int b){
        age = a;
        name = n;
        id = b;
    }
    public static void main(String[] args) {
        overloading obj1 = new overloading(15, "Sachin");
        overloading obj2 = new overloading(22, "Sachin", 01);

        System.out.println(obj1.id + " : "+ obj1.name + "  " + obj1.age);
        System.out.println(obj2.id + " : "+ obj2.name + "  " + obj2.age);

        
    }

}