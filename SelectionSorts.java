public class SelectionSorts {
    public static void main(String[] args) {
        int [] arr={3,6,4,9,2};
       
        for(int i=0;i<arr.length;i++){
        int index=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[index]){
                index=j;
            }
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
    }
    System.out.println("sorted array ");
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        }
    }
}

