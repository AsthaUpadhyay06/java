import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        try {
             int c=a/b;
        System.out.println(c);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("we can't divide");
        }
       
    }
}
