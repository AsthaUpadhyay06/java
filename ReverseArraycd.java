public class ReverseArraycd {
    public static void main(String[] args) {
        int [] arr={12,34,56,77,86,32};
        int i=0;
        int j=5;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        //print reverse array
        for(int num:arr){
            System.out.print(" " +num);
        }
    }
    
}
