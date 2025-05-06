
        class shape{
            void sound()
            {
                System.out.println("sound");
            }
        }
        class circle extends shape{
            void sound(){
                System.out.println("bark");
            }
        }
        class square extends shape{
            void sound(){
                System.out.println("draw");
            }
        }
        public class override3{
            public static void main(String[] args) {
                shape obj=new square();
                obj.sound();
        
                
            }
        }
        
    

