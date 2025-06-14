public class Reverse2dArray {
    public static void main(String[] args) {
        int [][]arr={{1,2,3,4},{5,6,7,8}};
       
        for(int i=0;i<arr.length;i++){
             int s=0;
        int end=arr[i].length-1;
            while(s<end){
                int temp=arr[i][s];
                arr[i][s]=arr[i][end];
                arr[i][end]=temp;
                s++;
                end--;

            }
        }
         for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
    
    }
    System.out.println();
}


    }
}
