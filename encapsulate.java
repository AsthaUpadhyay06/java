class ATM{
    private int a;
    void setRupees(int a){
        this.a=a; 
    }

int getRuppes(){
   return a;
 }
}
public class encapsulate
 {
    public static void main(String[] args) {
        ATM obj=new ATM();
        obj.setRupees(3400);
        System.out.println(obj.getRuppes());

        
    }
}

