import java.util.*;

public class SubarrayXor {
    public static int countSubarrays(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int xor = 0, count = 0;
        map.put(0, 1);
        for (int num : nums) {
            xor ^= num;
            if (map.containsKey(xor ^ k)) {
                count += map.get(xor ^ k);
            }
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 2, 2, 6, 4};
        System.out.println(countSubarrays(nums1, 6)); // 4

        int[] nums2 = {5, 6, 7, 8, 9};
        System.out.println(countSubarrays(nums2, 5)); // 2
    }
}
