public class missingnumberr {
    public static void main(String[] args) {
        int [] arr={0,1,3};
        int sum=0;
        int n=4;
        for(int i=0;i<n;i++)
        {
        sum=sum+i;

        
        }
        int actualsum=0;
        for(int i=0;i<arr.length;i++ ){
            actualsum+=arr[i];
        }
        int missing=sum-actualsum;
        System.out.println(missing);
        
    }
    
}
