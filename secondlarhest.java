public class secondlarhest {
    public static void main(String[] args) {
        int []arr={12,3,45,67,435,566,33,34,45};
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                     temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(arr[1]);
    }
    
}
