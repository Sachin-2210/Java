class human{
    private int age= 11;
    private  String name = "sachin";

  public int getage(){
        return age;
    } 
    public String  getname(){
        return name;
    } 


}


public class encapsulation{
    public static void main(String[] args) {
        human obj = new human();
        System.out.println(obj.getage() +"  :  "+obj.getname());
        
    }
}