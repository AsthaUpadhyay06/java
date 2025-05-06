public class java1{
    public static void main(String[] args) {
        int [] arr={ 1,2,3,4,5};
        int n=5;
        int [] ans=new int[n];
        int j=0;
        
        int k=2;
        k=k%n;

        int i;
        
        for( i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        // print rotated array 
        for(i=0;i<n;i++){
            System.out.print(ans[i]+ " ");
        }

    }
}
 
