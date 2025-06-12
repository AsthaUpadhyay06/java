public class code3 {
    public static void main(String[] args) {
        int[] arr={2,-3,5,-1,7,-8};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                sum=sum+arr[i];
            }
        }
        System.out.println(sum);
    }
}
