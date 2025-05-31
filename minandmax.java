public class minandmax {
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
        int [] arr={ 12,34,212,45,66};
        int result=maxarray(arr);
        int answer=minarray(arr);
        System.out.println("Maximum element is "+ result);
        System.out.println(" Minimum element is " +answer);
        
               
        
    }
}

