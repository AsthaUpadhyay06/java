public class rotatearrayby1 {
    public static void main(String[] args) {
        int[] arr={12,34,56,43,21};
        int n=arr.length;
        int temp=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
                arr[i+1]=arr[i];
        }
            arr[0]=temp;
            
        
    
        for(int i:arr){
            System.out.print(" " + i);
        }
    }
}

