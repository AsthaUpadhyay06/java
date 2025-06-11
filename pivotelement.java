public class pivotelement {
    public static int findpivotelement(int [] arr){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(arr[mid]>=arr[0]){
                s=mid+1;
            }
            else{
                e=mid;
            }
        }
        return s;

    }
    public static void main(String[] args) {
        int [] arr={3,8,10,17,1};
        int result=findpivotelement(arr);
        System.out.println(result);
    }
}