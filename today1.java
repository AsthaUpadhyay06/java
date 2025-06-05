


public class today1
 {
    public static void main(String[] args) {
    System.out.println("hello");
    Thread t1=new Thread(()->{
    System.out.println("hii");
    });
   
    System.out.println("last m aayange");
    Thread t2=new Thread(()->{
        System.out.println("astha");
    });
    t1.start();
    t2.start();

}
 }
