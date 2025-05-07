class student{
    void sum(int a){
        System.out.println(a);
    }
    void sum(int a,int b){
        System.out.println(a+b);
    }
}


public class overloading {
    public static void main(String[] args) {
        student obj=new student();
        obj.sum(34);
        obj.sum(23,45);
        
    }
}
