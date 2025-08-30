enum Laptop {
    // Macbook(20000) , XPS(50000), Surface(70000), Thinkpad (50859);

    Macbook(20000), XPS(50000), Surface, Thinkpad(50859);

    private int price;

    private Laptop(){
        price = 500;
        
    }

    private Laptop(int price) {
        this.price = price;
        System.out.println("in Laptop " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class Enum11 {
    public static void main(String a[]) {

        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap + " : "+ lap.getPrice());

        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }

}
