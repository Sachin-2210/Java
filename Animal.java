class Animal{
    String name;

    public void eat(){
        System.out.println("I CAN EAT----");
    }
}

class dog extends Animal {

    public void display(){

        System.out.println("My name is :"+ name);
    }  
}

public class main{
    public static void main(String[] args) {
        dog obj = new dog();
        obj.name = "Pilllu";
        obj.display();
        obj.eat();
    }
}