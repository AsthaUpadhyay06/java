 import java.util.*;

public class MinSwapsSort {
    public static int minSwaps(int[] nums) {
        int n = nums.length;
        int ans = 0;

        // Pairing elements with their original indices
        Pair[] arr = new Pair[n];
        for (int i = 0; i < n; i++)
            arr[i] = new Pair(nums[i], i);

        Arrays.sort(arr, Comparator.comparingInt(p -> p.val));
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i] || arr[i].index == i)
                continue;

            int cycle_size = 0;
            int j = i;

            while (!visited[j]) {
                visited[j];
            }
        }
    }
}
