import java.util.Scanner;

public class checksortedarray {
    public static void main(String[] args) {
        System.out.println("enter size of array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] num=new int[size];
        for (int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }

        boolean isAscending=true;

         for (int i=0;i<num.length-1;i++){
            if(num[i]>num[i+1]){
                isAscending=false;
               
            }
         }
       if(isAscending) {
           System.out.println("The array is sorted in ascending order");
       } else {
           System.out.println("The array is not sorted in ascending order");
       }
      
   }
}



 
