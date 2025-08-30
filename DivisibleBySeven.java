public class DivisibleBySeven {
    public static void main(String[] args) {
      //  System.out.println("Numbers between 100 and 200 that are divisible by 7:");
        for (int i = 100; i <= 200; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
