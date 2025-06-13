public class countandcheckaverage {
    public static void main(String[] args) {
        int [] arr={1,3,5,7,9};
        int averagearray=(1+3+5+7+9)/5;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>averagearray){
                count++;

            }
        }
        System.out.println("Numbers is " + count);
    }
}
