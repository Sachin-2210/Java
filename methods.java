
class room {
    public void music() {
        System.out.println("keep the music play");
        return;
    }

    public String getMeice(int cost) {

        if (cost >= 10)
            return "CONE";
        else
            return "nothing";

    }
}

public class methods {
    public static void main(String[] args) {

        room obj = new room();
        obj.music();
        String str = obj.getMeice(20);
        System.out.println(str);

    }

}
