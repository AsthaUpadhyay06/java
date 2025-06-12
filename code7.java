public class code7 {
    public static void main(String[] args) {
        int [] arr={1,2,4,5};
        int n=5;
        int totalsum=n*(n+1)/2;
        int actualsum=0;
        for(int i=0;i<arr.length;i++){
            actualsum=actualsum+arr[i];
        }
        int ans=totalsum-actualsum;
        System.out.println(ans);
    }
}
