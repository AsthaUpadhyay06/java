public class sortedarray {
    public static void main(String[] args) {
        int [] arr={1,4,3,7,6,9};
        boolean isSorted=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                isSorted=false;
                break;
            }
           
        }
         System.out.println("sorted array is " +isSorted);
    }
}
