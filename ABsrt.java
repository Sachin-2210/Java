 abstract class Car{   // if you make method abstract you have to make class also abstract
    abstract public void drive();
    public void music(){
        System.out.println("Playing Music....");
    }
}

// abstract class ke call non abstract method but abstract method should not call abstract class

class WagonR extends Car{   // concrete class
    public void drive(){
        System.out.println("Driving...");
    }
}


public class ABsrt{
    public static void main(String[] args) {
        Car obj = new WagonR();
        obj.drive();
        obj.music();
    }
}