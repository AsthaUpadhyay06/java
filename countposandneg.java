public class countposandneg {
    public static void main(String[] args) {
        int [] arr={1,-3,4,5,-2,0,7};
        int positive=0;
         int negative=0;
         int zero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                positive++;
            }
            else if(arr[i]<0){
                negative++;
            }
            else {
                zero++;
            }
        }
        System.out.println("Positive is " + positive);
        System.out.println("Negative is " + negative);
        System.out.println("Zero is " + zero);
    }
}
