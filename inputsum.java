import java.util.Scanner;

public class inputsum {
    public static int sumarray(int [] arr){
        int sum=0;
        
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];

        }
       return sum;

        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int total=sumarray(arr);
        System.out.println("sum is"+ total);
       

    } 
    }

