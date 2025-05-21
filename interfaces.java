interface client {
    void sum();
    void show();
}
class dev implements client{
    public void sum() {
        System.out.println("print ");
        
    }
    public void  show(){
        System.out.println("sum");

    }

    
}public class interfaces {
    public static void main(String[] args) {
        dev obj=new dev();
        obj.show();
        obj.sum();
        
    }
}
