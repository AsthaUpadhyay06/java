public class secondlargest {
    public static void main(String[] args) {
        int [] arr={ 12,3,45,67,8};
        int largest=arr[0];
        int secondlargest=arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]!=largest){
        
        secondlargest=arr[i];
    }
    }
    System.out.println(secondlargest);
}
}
