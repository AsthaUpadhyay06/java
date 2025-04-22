import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        System.out.println("enter array elements");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         
        int [] arr=new int[n];
      
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
      int sum=0;
        for(int j=0;j<arr.length;j++){
          sum=sum+arr[j];}
            System.out.println("sum is"+sum);
          
        }
    }

