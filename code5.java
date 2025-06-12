public class code5 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,2 ,2,2};
        int target=2;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }

        }
        System.out.println(count);
    }
}
