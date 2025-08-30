interface A{
    void show();
}

public class Lambda{
    public static void main(String[] args) {
      A obj = () -> System.out.println("in A show");
      obj.show();
    }
}

// -> this is lambda 