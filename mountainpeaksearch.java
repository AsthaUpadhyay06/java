public class mountainpeaksearch {
    
        public static  int peakindexmountain(int [] arr){
    int s=0;
     int e=arr.length -1;
     while(s<e){
    int mid=s+(e-s)/2;
    if(arr[mid]<arr[mid+1]){
        s=mid+1;
    }
    else{
        e=mid;
    }
}
return e;  
        }
        public static void main(String[] args) {
        // arr first me strictlt increasing hona chahiye and then strictly decreasing hona chahiye
        int [] arr={1,3,5,4,2};
        int peak=peakindexmountain(arr);
        System.out.println("peak index " + peak);
        System.out.println("peak value "+ arr[peak]);
    }
}
