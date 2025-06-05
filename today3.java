 class SimpleWaitNotify {
   private boolean isSignalled=false;

   public  synchronized void sendsignal(){
    isSignalled=true;
    System.out.println(" Producer : sending signal");
    notify();
   }
        public synchronized void waitsignal(){
            while (!isSignalled) {
                try {
                    System.out.println("consumer waiting for signal ");
                    wait();
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
                System.out.println("consumer: got the signal!  proceeding...");
                
            }
       
        
    


public class today3 {
    public static void main(String[] args) {
       SimpleWaitNotify obj=new SimpleWaitNotify();
        Thread consumer=new Thread(()->{
          obj.waitsignal();

        });
        Thread producer=new Thread(()->{
          try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
            obj.sendsignal();
        });

        consumer.start();
        producer.start();
    
        }

    }
    }

