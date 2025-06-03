

class MyThread extends Thread{
    public void run(){
        System.out.println("hello");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("astha upadhyay");
    }

}
public class Multithreading {
    public static void main(String[] args) {
        MyThread obj=new MyThread();
        obj.start();
       
        System.out.println("astha");
        
    }
}
