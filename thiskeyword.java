// class student{
//     int age;
//     void print(int age){
//       this.  age=age;
//        System.out.println(this);
//     }
// }


// public class thiskeyword {
//     public static void main(String[] args) {
//        student obj=new student();
//         obj.print(23);
//         System.out.println(obj.age);
        
//     }
// }

class student{
        int age;
        student(int age){
          this.  age=age;
          
        }
        void print(){
            System.out.println(age);
        }
    }
    
    
    public class thiskeyword {
        public static void main(String[] args) {
           student obj=new student(16);
          System.out.println(obj.age);
        }
    }
    