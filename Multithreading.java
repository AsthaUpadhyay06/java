

class MyThread extends Thread{
    public void run(){
        System.out.println("hello");
    }

}
public class Multithreading {
    public static void main(String[] args) {
        MyThread obj=new MyThread();
        obj.start();
        System.out.println("astha");
        
    }
}
