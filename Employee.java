

public class Employee {
    public static void main(String a[]){

        Work obj = new Work();
        obj.id = 1;
        obj.name= "Ramesh";
        obj.work = "Car penter";
         obj.info();
         obj.work();    

    }
    
}

class Worker{
    String name,work;
    int id;
    public void info(){
    System.out.print(id + " : "+ name);
} 
} 

class Work extends Worker{
    public void work(){
        System.out.println(" : " + work);
    }

}
