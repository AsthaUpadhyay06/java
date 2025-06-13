public class firstlast6 {
    public static  boolean firstLast(int[] nums) {
   return nums[0]==6|| nums[nums.length-1]==6;
}


    public static void main(String[] args) {
        int[] nums1={1,2,6};
         int[] nums2={6,1,2,3};
          int[] nums3={13,6,1,2};
          System.out.println(firstLast(nums1));
          System.out.println(firstLast(nums2));
          System.out.println(firstLast(nums3));
       
    }
}

