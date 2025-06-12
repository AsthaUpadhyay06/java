public class twosum {

    public static int sum(int [] arr){
        int[] ans=new int [2];
        int target=8;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    return ans;
                }
            }
        }
        
return  new  int[] {};
    }
    public static void main(String[] args) {
        int [] arr={1,7,4,5};
        
int [] result=sum(arr);
System.out.println());
    }
}
