
    
        interface Aw {
    void display();
   

    }
    interface B {
        void display();
        
    }
    class demo implements A,B{
        public void display(){
            System.out.println("DEMO.....");
        }
         
    }

public class  interfaceque4 {
    public static void main(String[] args) {
        demo obj=new demo();
        obj.display();

        
    }
    
}

  