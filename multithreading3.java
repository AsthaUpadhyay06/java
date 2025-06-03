
class downloadfile extends Thread{
    String file;
   public downloadfile(String file){
        this.file=file;
    }
        public void run(){

            for(int i=1;i<=5;i++){
    System.out.println(file+ " "+ "downloading......" + " " + (i*20)+ " %" );
    try {
        Thread.sleep(2000);;
    } catch (Exception e) {
        // TODO: handle exception
    }
    
}
System.out.println( file + " done");
    }
        }
public class multithreading3 {
    public static void main(String[] args) {
        downloadfile obj=new downloadfile("A");
           downloadfile obj2=new downloadfile("B");
         obj.start();
         obj2.start();
        
    }
}
