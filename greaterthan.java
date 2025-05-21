public class greaterthan {
    public static void main(String[] args) {
        int [] arr={2,7,4,9,5,67};
        int x=5;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(x<arr[i]){
                count ++;
            }
        }
        System.out.println("greater than x is -> " + count);
    }
}
