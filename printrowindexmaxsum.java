public class printrowindexmaxsum {
    public static void main(String[] args) {
        int[][]arr={{1,2,3},{4,5,6},{7,5,9}};
        int index=-1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int total=0;
            for(int j=0;j<arr[i].length;j++){
                total+=arr[i][j];
                if(total>sum){
                    sum=total;
                    index=i;
                }
            }

        }
        System.out.println("Maximum sum "+ index);
    }
}
