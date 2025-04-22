import java.util.Scanner;

public class arraymax {
    public static void main(String[] args) {
        System.out.println("enter size of array");
        Scanner sc=new Scanner(System. in);
        int n=sc.nextInt();
        int max=0;
        int i;
        int [] arr=new int[n];
        for(i=0;i<n;i++){ // array me input lena haiarr[i]
            arr[i]=sc.nextInt();       
        }
        for( int j=0;j<arr.length;j++){
        
            if(max<arr[j]){
                max=arr[j];
            }
        }
        System.out.println( "max"+max);
        }
    }

    


