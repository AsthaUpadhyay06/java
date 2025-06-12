public class passingarraytomethods {
    public static void change(int [] arr){
   arr[1]=57;
    }
    
   public static void main(String[] args) {
    int [] arr={12,34,56,67};
    System.out.println(arr[1]);
   
    change(arr);
    System.out.println(arr[1]);
   } 
}
