public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j]; // move unique element forward
            }
        }

        return i + 1; // length of unique part
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4};
        int newLength = removeDuplicates(arr);
        
        System.out.println("New length: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
} 