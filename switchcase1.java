public class switchcase1 {
public static void main(String[] args) {
    int  n= 1330;
   int  num=1;
  switch (num) {
    case 1:
    int note= n/100;
    System.out.println("Note required  " + note);
  
         case 2:
   note= n/50;
    System.out.println("Note required  " + note);
         
         case 3:
     note= n/20;
    System.out.println("Note required  " + note);
        
         case 4:
     note= n/1;
    System.out.println("Note required  " + note);
        
  
    default:
        break;
  }
}
}
