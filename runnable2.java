class WithdrawThread extends Thread{
 static int TotalBalance=1000;
 int amount;
 public WithdrawThread(int amount){
this.amount=amount;
 }
 public void run(){
    if(TotalBalance>=amount){
        System.out.println("withdraw successfull " + amount );
        
    
    try {
         
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        TotalBalance=TotalBalance-amount;
        System.out.println(" remaining balance "+ TotalBalance );
        
    }
    else{
        System.out.println("insufficient balance" );
    }
 }

}

public class runnable2 {
    public static void main(String[] args) {
        WithdrawThread t1=new WithdrawThread(800);
        WithdrawThread t2=new WithdrawThread(500);
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            // TODO: handle exception
        }
        t2.start();      
    }
    }

