public class secondlar {
    public static void main(String[] args) {
        int [] arr={ 12,34,56,43,21};
        int largest=arr[0];
        int secondlargest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                secondlargest=largest;
            }
            else if(largest!=arr[i] && arr[i]>largest)
            {
secondlargest=arr[i];
            }
        
        System.out.println(secondlargest);}
    }
}