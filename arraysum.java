import java.util.Scanner;

public class arraysum {
    public static void main(String[] args) {
        System.out.println("enter size of array");
        Scanner sc=new Scanner(System. in);
        int n=sc.nextInt();
        int sum=0;
        int i;
        int [] arr=new int[n];
        for(i=0;i<n;i++){ // array me input lena hai

            arr[i]=sc.nextInt();
        }
        for( i=0;i<arr.length;i++){
            sum=sum+arr[i];}
        System.out.println("sum is" +sum);
        }
    }

