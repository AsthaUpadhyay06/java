
    abstract class shape{
        abstract void area(int a,int b);
        
      void success(){
       System.out.println("success");
      
       }
   }
   class circle extends shape{
       void area(int r,int k){
           System.out.println(3.14*r*r);
       }
   }
   class rectangle extends shape{
       void area(int l,int b){
           System.out.println(l*b);
       }
   }
   
   public class abstractclass2 {
       public static void main(String[] args) {
           
          shape obj=new circle();
           obj.area(3,5);
           obj.success();
   
          shape obj1=new rectangle();
           obj1.area(2,5);
           obj1.success();
       }
   }
   

// abstract class animal{
//     abstract void sound(int a);
    
//   void success(){
//    System.out.println("success");
  
//    }
// }
// class dog extends animal{
//    void sound(int a){
//        System.out.println("pay with cash"  +a);
//    }
// }
// class cat extends animal{
//    void sound(int a){
//        System.out.println("payment via netbanking" +a);
//    }
// }

// public class abstractclass2 {
//    public static void main(String[] args) {
       
//      animal obj=new dog();
//        obj.sound(34000);
//        obj.success();

//       animal obj1=new cat();
//        obj1.sound(45000);
//        obj1.success();
//    }
// }
