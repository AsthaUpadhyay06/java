public class  binarysearch2 {
    public static int firstocc(int [] arr,int key){
        int start=0;
        int ans=-1;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                ans=mid;
                end=mid-1;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
     } 
      public static int lastocc(int [] arr,int key){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){ 
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                ans=mid;
               start=mid+1;
                
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
     } 
    public static void main(String[] args) {
        int [] arr={1,2,3,3,4,5};
        int result=firstocc(arr,3);
         int results=lastocc(arr,3);
        System.out.println("first occ at index "+ result);
          System.out.println("last occ at index "+ results);
    }
}


