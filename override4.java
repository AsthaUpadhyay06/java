class employee{
    void calculatesalary( int s){
       
        System.out.println("salary " +s);
    }
}
class manager extends employee{
    void calculatesalary(int s){
        int bonous=560;
        
        System.out.println("salary  " + (s + bonous));
    }
}

public class override4 {
    public static void main(String[] args) {
        employee obj=new manager();
        obj.calculatesalary( 34000);
        
    }
}
