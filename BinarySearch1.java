import java.util.Arrays;

public class BinarySearch1 {
    public static int BinarySearch(int [] arr,int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
     } 
    public static void main(String[] args) {
        int [] even={12,32,45,67,89,97};
        int [] odd={23,34,56,76,90};
        int evenkey=45;
        int oddkey=90;
        Arrays.sort(even);
        Arrays.sort(odd);
        int result=BinarySearch(even,evenkey);
        int res=BinarySearch(odd,oddkey);
        if(result !=-1){
            System.out.println("even array " +evenkey + " found at "+ result);
        }
        else{
            System.out.println("even array " +evenkey + "not  found at ");
        }
         if(res !=-1){
            System.out.println("odd array " +oddkey + " found at "+ res);
        }
        else{
            System.out.println("odd array " + oddkey + "not  found at ");
        }
    }
}
