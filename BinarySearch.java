

public class BinarySearch {
    public static int binarysearch(int [] arr,int key){
        int start=0;
        int end=arr.length-1;
        int mid;
        while(start<=end){
           mid=start+end/2;
            if(arr[mid]==key){
               return mid;
            }
            else if (arr[mid]<key) {
            start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int [] arr={ 12,34,55,67};
            int total=binarysearch(arr, 67);
            if(total==-1){
                System.out.println("element not found in  the array");

            }
            else{
                System.out.println("element found at index: " + total);
            }
        }
    }

