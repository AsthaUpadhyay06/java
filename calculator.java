import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=4;
        int b=5;
        char  ch= sc.next().charAt(0);
        System.out.println("user value"+ch);
        switch(ch){
            case '+':
        System.out.println("a+b->"+ (a+b));
        break;
        case '*':
        System .out.println("a+b->" +(a*b));
        break;
        case '/':
        System .out.println("a+b->" +(a/b));
        break;
        case '%':
        System .out.println("a+b->"+ (a%b));
        break;
      

        

        }
        
<<<<<<< HEAD
        sc.close();
=======
     sc.close();   
>>>>>>> 97206e0ae6cae4032fe571871ba1ca2ab552d831
    }
}
