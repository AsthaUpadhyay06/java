public class codep {
    
    public static void main(String[] args) {
        int [] arr={1,3,2,3,4,3,5};
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }

            }
           if(count==1){
            System.out.println(arr[i]);
           }
           if(count==2){
            System.out.println(arr[i]);
           }
           if(count==3){
            System.out.println(arr[i]);
           }
           
        }
    }
}

