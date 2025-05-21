public class smallestnum {
    public static void main(String[] args) {
        int [] arr={4,2,9,0,7};
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(smallest>arr[i]){
                smallest=arr[i];

            }
        }
        System.out.println("smallest is " + smallest);
    }
}
