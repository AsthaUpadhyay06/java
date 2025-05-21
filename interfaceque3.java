interface Walkable {
    void walk();
    void run();

    }
    interface Runable {
        void walk();
        void run();
        
    }
    class Human implements Walkable,Runnable{
        public void walk(){
            System.out.println("walking.....");
        }
         public void run(){
            System.out.println("runing.....");
        }
        
    }

public class  interfaceque3 {
    public static void main(String[] args) {
        Human obj=new Human();
        obj.walk();
        obj.run();

        
    }
    
}
