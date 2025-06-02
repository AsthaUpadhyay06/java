import java.util.ArrayList;
import java.util.Scanner;

public class arraylist3 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
    
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
    
        for(int i=0;i<10;i++){
            list.add(sc.nextInt());
        }
        for(int number:list)
            if(number%2==0){
                System.out.println("even number "+ number);
            }
        }

    }

