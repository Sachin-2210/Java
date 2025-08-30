enum status{
    Running ,Failed, Pending, Success;
}



public class Enum22 {

    public static void main(String a[]){
        // int i = 5;
        status[] s = status.values();
        for(status y : s ){
            System.out.println(y+ " : " + y.ordinal());
        }
    }
}