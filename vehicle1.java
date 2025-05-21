
interface vehicle{
  default  void start(){
        System.out.println("vehicle is starting....");
    }
}
class Car implements vehicle{

}
    
public class vehicle1 {
    public static void main(String[] args) {
        Car obj=new Car();
        obj.start();
    }
}
