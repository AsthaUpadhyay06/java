







class animal{
    void eat(){
        System.out.println("eatinggg");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("barkinggg");

}
}
 public class inheritance{

    public static void main(String[] args) {
        dog obj=new dog();
        obj.bark();
    }
   }

