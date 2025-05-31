import java.util.Scanner;

public class minmax {
  public static int maxarray(int [] arr){
        int max=arr[0];
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
            return max;
    }
public static int minarray(int [] arr){
    int min=arr[0];
        for(int i:arr){
            if(i<min){
                min=i;
            }
        }
  return min;
        }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of elements ");
        
        int n = sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=maxarray(arr);
        int answer=minarray(arr);
        System.out.println("Maximum element is "+ result);
        System.out.println(" Minimum element is " +answer);
        
               
        
    }
}
