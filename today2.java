
class MyThread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
System.out.println( getName()+ "  is rummimg with priority " + getPriority());
Thread.yield();

        }
    }
}

public class today2 {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
         MyThread t2=new MyThread();
       t1.setName("Aastha");
       t2.setName("Aayaana");
         t1.setPriority(Thread.MAX_PRIORITY);
         t2.setPriority(Thread.MIN_PRIORITY);

         t1.start();
         t2.start();

        
        
    }
}
