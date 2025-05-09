abstract class payment{
     abstract void sum(int a);
     
   void success(){
    System.out.println("success");
   
    }
}
class UpiPayment extends payment{
    void sum(int a){
        System.out.println("pay with cash"  +a);
    }
}
class Netbanking extends payment{
    void sum(int a){
        System.out.println("payment via netbanking" +a);
    }
}

<<<<<<< HEAD
class abstractclass {
=======
 class abstractclass {
>>>>>>> 97206e0ae6cae4032fe571871ba1ca2ab552d831
    public static void main(String[] args) {
        
        payment obj=new UpiPayment();
        obj.sum(34000);
        obj.success();

        payment obj1=new Netbanking();
        obj1.sum(45000);
        obj1.success();
    }
}
