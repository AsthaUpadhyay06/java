
class animal{
    void sound()
    {
        System.out.println("sound");
    }
}
class dog extends animal{
    void sound(){
        System.out.println("bark");
    }
}
public class override1 {
    public static void main(String[] args) {
        animal obj=new dog();
        obj.sound();

        
    }
}
