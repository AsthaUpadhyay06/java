class MyRynnable implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName()+ "  Hiii");
    }
}

public class runnable {
    public static void main(String[] args) {
        MyRynnable obj=new MyRynnable();
        Thread t1=new Thread(obj);
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        System.out.println("main thread is running");

        
    }
}
