class animal{
    void run(){
        System.out.println("run");

    }
}
class dog extends animal{
    void run(){
        System.out.println("animal");
    }
}

public class overridequestion {
    public static void main(String[] args) {
        animal obj= new dog();
        obj.run();
        
    }
}
