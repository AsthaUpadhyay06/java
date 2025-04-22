import java.util.Scanner;

public class arraymin {
    public static void main(String[] args) {
        System.out.println("enter size of array");
        Scanner sc=new Scanner(System. in);
        int n=sc.nextInt();
    
        int i;
        int [] arr=new int[n];
        for(i=0;i<n;i++){ // array me input lena haiarr[i]
            arr[i]=sc.nextInt();       
        }
        int min=arr[0];
        for( int j=arr.length; j>0;j++){
        
            if(min>arr[j]){
                min=arr[j];
            }
        }
        System.out.println( "min"+min);
        }
}
