import java.util.Scanner;

public class exception5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);

    
try {
    System.out.println("enter input");
   String str=sc.next();
     System.out.println(str.toUpperCase());

} catch (Exception e) {
    // TODO: handle exception
    System.out.println("input is null");
}
   
  
    
    }
}
