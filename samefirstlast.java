public class samefirstlast {
    public static  boolean sameFirstLast(int[] nums) {
  return nums.length>=1 && nums[0]==nums[nums.length-1] ;
}

  public static void main(String[] args) {
     int [] nums1= {1, 2, 3} ;
int [] nums2={1, 2, 3, 1}; 
int [] nums3={1, 2, 1};
System.out.println(sameFirstLast(nums1));
System.out.println(sameFirstLast(nums2));
System.out.println(sameFirstLast(nums3));

  }
}
