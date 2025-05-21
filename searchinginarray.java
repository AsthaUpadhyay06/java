public class searchinginarray {
   public static void main(String[] args) {
    int [] arr={4,7,2,9,5};
    int x=9;
    for(int i=0;i<arr.length;i++){
        if(x==arr[i]){
            System.out.println("at index " + i );
        }
    }
   } 
}
