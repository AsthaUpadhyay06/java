class main{
    void data(){
        System.out.println("main classs haii");
        
    }
}
class hello extends main{
    void data(){
        System.out.println("hello class hai");
       super.data();
    }
}

public class override {
    public static void main(String[] args) {
        main obj=new hello();
        obj.data();

    }
}
