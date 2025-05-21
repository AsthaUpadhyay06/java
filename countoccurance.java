public class countoccurance {
    public static void main(String[] args) {
        int [] arr={1,2,3,2,5,2};
        int x=2;
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                count++;

            }
        }
        System.out.println("x arrives " +count + " times");
    }
}
