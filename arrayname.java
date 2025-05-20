import java.util.Scanner;

public class arrayname {
    public static void main(String[] args) {
        System.out.println("Enter size");
        
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        String[]names= new String[size];
        for(int i=0;i<size;i++){
           names[i]=sc.next();

        }
        for(int i=0;i<size;i++){
            System.out.println("name " + (i+1) +" is : " + names[i]);

        }
    }
}
