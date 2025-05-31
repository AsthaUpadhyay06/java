public class linearsearch {
    public static int findlinearsearch(int [] arr,int key )
    {

 for(int i=0;i<arr.length;i++){
           if(key==arr[i]){
            return i;
           }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        
        int[] arr={12,3,45,67,86,54,23};
        for(int i=0;i<arr.length;i++){
           
        }
       int result=findlinearsearch(arr, 86);
       if(result!=0){
        System.out.println("element found at index " + result);
       }
       else{
        System.out.println("not found");
       }
    }
}
