 interface A{
    void sum();
    void print();
 }
 interface B {
    void show();
 }
class C implements A,B{
   public void sum(){
    System.out.println("a+b");

    }
   public void print(){
    System.out.println("iam print function");

    }
    public void show(){
        System.out.println("iam a show function");
    }
}
 class multipleinheritance {
    public static void main(String[] args) {
        C obj=new C();
        obj.sum();
        obj.print();
        obj.show();
        
    }
    }

