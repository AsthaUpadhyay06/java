 interface Inter {
    void sound();
    
    }
    
    
    class Dogyy implements Inter{
        public void sound(){
            System.out.println("bark....");
        }
         
        
    }

public class  interfaceque5 {
    public static void main(String[] args) {
          Inter obj=new Dogyy();
                     obj.sound();
        
    }
    

}
