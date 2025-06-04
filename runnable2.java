class WithdrawThread extends Thread{
 static int TotalBalance=1000;
 int amount;
 public WithdrawThread(int amount){
this.amount=amount;
 }
 public void run(){
   
        if (TotalBalance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw " + amount);

            try { Thread.sleep(1000); } catch (InterruptedException e) {}

            TotalBalance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + TotalBalance);
        } else {
            System.out.println(Thread.currentThread().getName() + " - Insufficient balance");
        }
    }
}
   

public class runnable2 {
    public static void main(String[] args) {
        WithdrawThread t1=new WithdrawThread(800);
        WithdrawThread t2=new WithdrawThread(500);
        t1.start();
        
        t2.start();      
    }
    }

//class WithdrawThread extends Thread {Add commentMore actions
//     static int balance = 1000; // shared account balance
//     int amount;

//     WithdrawThread(int amount) {
//         this.amount = amount;
//     }

//     public void run() {
//         // ⚠️ No synchronization used here
//         if (balance >= amount) {
//             System.out.println(Thread.currentThread().getName() + " is going to withdraw " + amount);

//             try { Thread.sleep(1000); } catch (InterruptedException e) {}

//             balance -= amount;Add commentMore actions
//             System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
//         } else {
//             System.out.println(Thread.currentThread().getName() + " - Insufficient balance");
//         }
//     }
// }