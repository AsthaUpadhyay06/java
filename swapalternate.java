public class swapalternate {
    public static void swap(int [] arr){
        for(int i=0;i<arr.length;i+=2){
           int temp;
           temp=arr[i];
           arr[i]=arr[i+1];
           arr[i+1]=temp;
        }
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        swap(arr);
        for(int num: arr){
            System.out.print( " " + num);
        }


        
        
    }
}
